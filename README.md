# Simulation-Experiment-Management: Framework for executing and managing simulation experiments

MDE-enhanced Eclipse tool chain to identify, prioritize, formulate questions, and conjecture mechanisms, define or generate experiments designed to answer questions, draw inferences, and evaluate result.

 A Domain-Specific Experiment Management Languageis developed towards defining families of simulation experiments, in accordance with theDOE methodology.A web editor to document the experiment specification is available to the user. 
This framework also provides support for model verification by processing input from a domain specific language for domain specific simulation experiments. It takes a set of evidences and hypotheses from the DSL and creates an observer of the simulation to record data related to these evidence/hypotheses. It converts the simulation data to a discrete time markov chain which is validated using a probabilistic model checker.

The results of the  model checking are incorporated into Bayesian networks which is used to illustrate the probability of events in the simulation model. These can be incorporated for active learning and automation in the system for selecting better experiments at a faster rate to increase knowledge gain. A decision tree that analyzes the experiment data, is used to identify factors that better charaterize the model behavior.


# Motivation

The Goal-Hypothesis-Experiment framework: A generative cognitive domain architecture for simulation experiment management.

# Download
Please refer to the Simulation Experiment Management project page to download the latest release:

```
https://github.com/szc0098/Simulation-Experiment-Management
```

# Dependencies:

- [XText](https://www.eclipse.org/Xtext/download.html)

- A web application server (we used Jetty server)

- [PRISM Model Checker](http://www.prismmodelchecker.org/manual/InstallingPRISM/Instructions#source)

# Development
The principles of model-driven software development are used throughout the development
process. We started by developing a metamodel for the language in the form of a UML
class model in order to facilitate understanding of the domain. We used this metamodel
as a roadmap to develop a Xtext grammar and evaluated its readability
in a reference model. The grammatical constructs defined in the Xtext grammar were
used to identify classes and structures for a reference implementation, where a use-case
for the application was developed and tested. Through development of the reference
implementation, we were able to identify sections of code that were candidates for text-
to-model transformation. These transformations bridge the gap between reference model,
reference implementation, and platform.
The process was an effective tool for streamlining the development of a DSL-driven
application. By focusing on the way the language will be used before the implementation,
we were able to create a highly expressive language while providing support for platform
versatility.

## Metamodel
The metamodel encompasses all the major components of the GHE framework. It includes the goal of the experiment, model definition, hypothesis and an experiment. 
![GHE Metamodel](https://github.com/szc0098/Simulation-Experiment-Management/blob/master/13.png)

# Domain Specific Language(DSL)
The DSL for simulation experiment model development is developed using the Xtext
DSL development environment on Eclipse Neon, by translating the experiment ontology
metamodel.

```ruby
ExperimentOntology :
	ModelSection |Goals | Hypothesis | Experiment
;
	
ModelSection:
	'model' (modName = ID) 
	'{'
	(mechanisms += Mechanism)*
	((events += EventDescriptor)?)*
	(parameters += Factor)*
	'}'
;	

Mechanism:
	'mechanism' (mechanismName = ID) ' = ' (LHS = Reaction) (condition = GuardCondition)? ' -> ' (RHS = Reaction)
;

```
# Reference Model
In order to test the validity of our framework and the practical utility of the approach,
we used our project to demonstrate the ISHC model. The DSL we developed is abstract
and free of any technical terms. The DSL covers all relevant concepts of the domain
with language elements. All schematically-implementable code fragments of the reference
implementation are covered by constructs of the DSL. The reference ISHC model is an
instance of the DSL. The DSL for simulation experiment model is developed by mapping
the experiment ontology metamodel.
- **Model:**
Model consists of a specification about the models name, the mechanisms, the events and
the factor parameters. Mechanisms consist of the processes which is assumed to take place
in the simulation system. Events define the path for tracing the functions that evaluate
the events that form a part of the evidences. Parameters are the inputs to the model
and their properties, which have an impact in determining the response/output of the
simulation run.
```ruby
model ISHC{
    mechanism M1 = inflammatoryAgent + Kupffercells 
                [inflammatoryAgent > inflammatorythreshold] -> Cytokines
    mechanism M2 = inflammatoryAgent + Kupffercells 
                [noOfCytokine > cytokineThreshold] -> Cytokines
    event inflammation = 'void ishc.model.KupfferCell.handleInflammation()'
    parameter LPS = Solute with properties {tag: LPS, bindable: true ,
                    bolusRatio:1.0 , pExitMedia: 0.1 , pExitCell: 1.0 , 
                     inflammatory : true , pDegrade : 0.0
                    }
     parameter drRate = DISCRETE with values {30}
    }
```
- **Goal:**
Goals define what the purpose of the experiment is. It also gives an idea about the specific
field of concern and the context under which the study is performed.
```ruby
    goal
    {
    object of study : 'Immune system influence on hepatic cytochrome P450
                        regulation'
    purpose : 'Explain / characterize'
    focus : 'the reason for changes in downstream drug metabolism and
                hepatotoxicity'
    view point : 'based on the response of hepatic cytochrome P450-
                regulating mechanisms'
    context : 'when health and/or therapeutic interventions change.'
    }
```
- **Hypotheses:**
Hypotheses consists of relational hypotheses, mechanistic hypotheses and expected regularities. Mechanistic hypotheses deal with the effect of changes in the mechanism of the
model. Relational hypotheses deal with the impact of changes in inputs or outputs. In
order to represent behavioral changes in the model, we focus on mechanistic hypotheses
for the study. Expected regularities are the temporal properties that are to be verified in
the experimental run. It is stated in terms of state of factors and their properties.
The coherence model describes the explanatory coherence relation between the hypothesis and the evidence. The evidence can have an activation weight
which indicates its reliability. This is used to establish the weightage of the link between
the evidence and hypothesis in the coherence network. 
```ruby
 hypotheses
    {
    mechanistic hypotheses
    {
        H1 : M1 occurs before M2
    }
    evidence
    {
        E1: inflammation occurs after inflammatoryAgent >
            inflammatoryAgentThreshold
        activation weight : 0.5
    }
    coherence model
     {
        EXPLAIN (H1)(E1)
        DATA (Experiment1)(E1 E2)
    }
    }
```
- **Experiment:**
The ontology for the experiment section encompasses the structural elements of an experiment which includes the experiments design and performance measure. Based on the models parameters and their levels, the hypotheses and goal of the experiment, a design
is created that is used in subsequent steps of the experiment life-cycle.
The experimental design is defined by the dependent variables, the control variables,
the independent variables and their levels, constraints and values which in turn are mappings of the variables provided by the user. Based on this design, one can define what
is known as a design matrix, which specifies the actual experimental runs, that is, the
combination of factor levels.
```ruby
   experiment Exp1{
        design {
            variables{
                independent variables
                    {
                    LPS are at levels : LOW where LOW is in the range 1.0 to
                                        1.0
                    }
                dependent variables
                    {
                    cytokines : type SIMPLE
                    }
                }
            }
```
- **Performance Measure:**
An experiment consists of performance measure parameters which defines the criteria for
successful experimental run. Basing on this measure we can decide whether additional
iterations are required for satisfying the experiments objective. It is defined in terms of
the expected value of the response or output of the experiment and its standard deviation.
```ruby
performance measure is
            {

                cytokines= 500 +-10
            }
```
In the above example, the expected value of the cytokines after successful experiment
execution is 500 with a standard deviation of 10.

# Code Generation

We used the Xtend code generation process for mapping the DSL to platform. A set of
templates were derived from the reference implementation and used for the transformation
step. 
```ruby
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile('ishc.properties', toISHCProperties(resource.allContents
				.filter(typeof(ModelSection)).head))
		fsa.generateFile('delivery.properties', toDeliveryProperties(resource.allContents
				.filter(typeof(ModelSection)).head , resource.allContents.filter(typeof(Experiment)).head))
		fsa.generateFile("KupfferCell.java", toKupfferCell(resource.allContents
				.filter(typeof(ModelSection)).head))
		fsa.generateFile("Hepatocyte.java", toHepatocyte(resource.allContents
				.filter(typeof(ModelSection)).head))
	}
```
The experiment specifictaion is used for code generation by the template engine. The
experiment specification defined using the DSL and the generated artifacts were used to
run the ISHC simulation model in MASON to get the results.

# Execution:
Run the ServerLauncher.java in the package org.xtext.example.mydsl.web.

This will launch the server and you can look at the web interface at localhost

For details please look into : https://github.com/szc0098/Simulation-Experiment-Management/blob/master/SImulation%20Experiment%20Management.pdf
