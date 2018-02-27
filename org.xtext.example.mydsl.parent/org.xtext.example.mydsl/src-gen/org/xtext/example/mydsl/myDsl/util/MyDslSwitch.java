/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPERIMENT_ONTOLOGY:
      {
        ExperimentOntology experimentOntology = (ExperimentOntology)theEObject;
        T result = caseExperimentOntology(experimentOntology);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MODEL_SECTION:
      {
        ModelSection modelSection = (ModelSection)theEObject;
        T result = caseModelSection(modelSection);
        if (result == null) result = caseExperimentOntology(modelSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MECHANISM:
      {
        Mechanism mechanism = (Mechanism)theEObject;
        T result = caseMechanism(mechanism);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.REACTION:
      {
        Reaction reaction = (Reaction)theEObject;
        T result = caseReaction(reaction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.GUARD_CONDITION:
      {
        GuardCondition guardCondition = (GuardCondition)theEObject;
        T result = caseGuardCondition(guardCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EVENT_DESCRIPTOR:
      {
        EventDescriptor eventDescriptor = (EventDescriptor)theEObject;
        T result = caseEventDescriptor(eventDescriptor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FACTOR:
      {
        Factor factor = (Factor)theEObject;
        T result = caseFactor(factor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROPERTIES:
      {
        properties properties = (properties)theEObject;
        T result = caseproperties(properties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VALUES:
      {
        Values values = (Values)theEObject;
        T result = caseValues(values);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.GOALS:
      {
        Goals goals = (Goals)theEObject;
        T result = caseGoals(goals);
        if (result == null) result = caseExperimentOntology(goals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.HYPOTHESIS:
      {
        Hypothesis hypothesis = (Hypothesis)theEObject;
        T result = caseHypothesis(hypothesis);
        if (result == null) result = caseExperimentOntology(hypothesis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COHERENCE_LINK:
      {
        CoherenceLink coherenceLink = (CoherenceLink)theEObject;
        T result = caseCoherenceLink(coherenceLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MECH_HYPOTHESIS:
      {
        MechHypothesis mechHypothesis = (MechHypothesis)theEObject;
        T result = caseMechHypothesis(mechHypothesis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EVIDENCE:
      {
        Evidence evidence = (Evidence)theEObject;
        T result = caseEvidence(evidence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TEMPORAL_PATTERN:
      {
        TemporalPattern temporalPattern = (TemporalPattern)theEObject;
        T result = caseTemporalPattern(temporalPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = caseTemporalPattern(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SIMULTANEOUS:
      {
        Simultaneous simultaneous = (Simultaneous)theEObject;
        T result = caseSimultaneous(simultaneous);
        if (result == null) result = caseEvent(simultaneous);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DISPERSED:
      {
        Dispersed dispersed = (Dispersed)theEObject;
        T result = caseDispersed(dispersed);
        if (result == null) result = caseEvent(dispersed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RELATIONAL_QUERY:
      {
        RelationalQuery relationalQuery = (RelationalQuery)theEObject;
        T result = caseRelationalQuery(relationalQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.QUERY1:
      {
        Query1 query1 = (Query1)theEObject;
        T result = caseQuery1(query1);
        if (result == null) result = caseRelationalQuery(query1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.QUERY2:
      {
        Query2 query2 = (Query2)theEObject;
        T result = caseQuery2(query2);
        if (result == null) result = caseRelationalQuery(query2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.QUERY3:
      {
        Query3 query3 = (Query3)theEObject;
        T result = caseQuery3(query3);
        if (result == null) result = caseRelationalQuery(query3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPERIMENT:
      {
        Experiment experiment = (Experiment)theEObject;
        T result = caseExperiment(experiment);
        if (result == null) result = caseExperimentOntology(experiment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DESIGN:
      {
        Design design = (Design)theEObject;
        T result = caseDesign(design);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VARIABLES:
      {
        Variables variables = (Variables)theEObject;
        T result = caseVariables(variables);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INDEPENDENT_VARIABLES:
      {
        IndependentVariables independentVariables = (IndependentVariables)theEObject;
        T result = caseIndependentVariables(independentVariables);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONTROL_VARIABLES:
      {
        ControlVariables controlVariables = (ControlVariables)theEObject;
        T result = caseControlVariables(controlVariables);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DEPENDENT_VARIABLES:
      {
        DependentVariables dependentVariables = (DependentVariables)theEObject;
        T result = caseDependentVariables(dependentVariables);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FACTOR_LEVELS:
      {
        FactorLevels factorLevels = (FactorLevels)theEObject;
        T result = caseFactorLevels(factorLevels);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RESPONSE:
      {
        Response response = (Response)theEObject;
        T result = caseResponse(response);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ITERATION:
      {
        Iteration iteration = (Iteration)theEObject;
        T result = caseIteration(iteration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PERFORMANCE_MEASURE:
      {
        PerformanceMeasure performanceMeasure = (PerformanceMeasure)theEObject;
        T result = casePerformanceMeasure(performanceMeasure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Experiment Ontology</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Experiment Ontology</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExperimentOntology(ExperimentOntology object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelSection(ModelSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mechanism</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mechanism</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMechanism(Mechanism object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reaction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reaction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReaction(Reaction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guard Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guard Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuardCondition(GuardCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Descriptor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Descriptor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventDescriptor(EventDescriptor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Factor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Factor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFactor(Factor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseproperties(properties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Values</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Values</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValues(Values object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoals(Goals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hypothesis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hypothesis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHypothesis(Hypothesis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Coherence Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coherence Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoherenceLink(CoherenceLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mech Hypothesis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mech Hypothesis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMechHypothesis(MechHypothesis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evidence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvidence(Evidence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Temporal Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Temporal Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemporalPattern(TemporalPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simultaneous</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simultaneous</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimultaneous(Simultaneous object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dispersed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dispersed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDispersed(Dispersed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relational Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relational Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationalQuery(RelationalQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuery1(Query1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuery2(Query2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuery3(Query3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Experiment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Experiment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExperiment(Experiment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Design</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Design</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesign(Design object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variables</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variables</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariables(Variables object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Independent Variables</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Independent Variables</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndependentVariables(IndependentVariables object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Variables</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Variables</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlVariables(ControlVariables object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependent Variables</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependent Variables</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependentVariables(DependentVariables object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Factor Levels</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Factor Levels</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFactorLevels(FactorLevels object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Response</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResponse(Response object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Iteration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Iteration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIteration(Iteration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Performance Measure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Performance Measure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePerformanceMeasure(PerformanceMeasure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
