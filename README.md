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

# Execution:
Run the ServerLauncher.java in the package org.xtext.example.mydsl.web.

This will launch the server and you can look at the web interface at localhost

For details please look into : https://github.com/szc0098/Simulation-Experiment-Management/blob/master/SImulation%20Experiment%20Management.pdf
