# Simulation-Experiment-Management
# Framework for executing and managing simulation experiments

MDE-enhanced Eclipse tool chain to identify, prioritize, formulate questions, and conjecture mechanisms, define or generate experiments designed to answer questions, draw inferences, and evaluate result.

 A Domain-Specific Experiment Management Languageis developed towards defining families of simulation experiments, in accordance with theDOE methodology.A web editor to document the experiment specification is available to the user. 
This framework also provides support for model verification by processing input from a domain specific language for domain specific simulation experiments. It takes a set of evidences and hypotheses from the DSL and creates an observer of the simulation to record data related to these evidence/hypotheses. It converts the simulation data to a discrete time markov chain which is validated using a probabilistic model checker.

The results of the  model checking are incorporated into Bayesian networks which is used to illustrate the probability of events in the simulation model. These can be incorporated for active learning and automation in the system for selecting better experiments at a faster rate to increase knowledge gain. A decision tree that analyzes the experiment data, is used to identify factors that better charaterize the model behavior.


# Motivation

The Goal-Hypothesis-Experiment framework: A generative cognitive domain architecture for simulation experiment management.


# Dependencies:

XText

A web application server (we used Jetty server)

MASON

PRISM Model Checker http://www.prismmodelchecker.org/manual/InstallingPRISM/Instructions#source

# Execution:
Run the ServerLauncher.java in the package org.xtext.example.mydsl.web.

This will launch the server and you can look at the web interface at localhost

For details please look into : https://github.com/szc0098/Simulation-Experiment-Management/blob/master/SImulation%20Experiment%20Management.pdf
