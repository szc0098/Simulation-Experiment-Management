/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.EXPERIMENT_ONTOLOGY: return createExperimentOntology();
      case MyDslPackage.MODEL_SECTION: return createModelSection();
      case MyDslPackage.MECHANISM: return createMechanism();
      case MyDslPackage.REACTION: return createReaction();
      case MyDslPackage.GUARD_CONDITION: return createGuardCondition();
      case MyDslPackage.EVENT_DESCRIPTOR: return createEventDescriptor();
      case MyDslPackage.FACTOR: return createFactor();
      case MyDslPackage.PROPERTIES: return createproperties();
      case MyDslPackage.VALUES: return createValues();
      case MyDslPackage.GOALS: return createGoals();
      case MyDslPackage.HYPOTHESIS: return createHypothesis();
      case MyDslPackage.COHERENCE_LINK: return createCoherenceLink();
      case MyDslPackage.MECH_HYPOTHESIS: return createMechHypothesis();
      case MyDslPackage.EVIDENCE: return createEvidence();
      case MyDslPackage.TEMPORAL_PATTERN: return createTemporalPattern();
      case MyDslPackage.CONDITION: return createCondition();
      case MyDslPackage.EVENT: return createEvent();
      case MyDslPackage.SIMULTANEOUS: return createSimultaneous();
      case MyDslPackage.DISPERSED: return createDispersed();
      case MyDslPackage.RELATIONAL_QUERY: return createRelationalQuery();
      case MyDslPackage.QUERY1: return createQuery1();
      case MyDslPackage.QUERY2: return createQuery2();
      case MyDslPackage.QUERY3: return createQuery3();
      case MyDslPackage.EXPERIMENT: return createExperiment();
      case MyDslPackage.DESIGN: return createDesign();
      case MyDslPackage.VARIABLES: return createVariables();
      case MyDslPackage.INDEPENDENT_VARIABLES: return createIndependentVariables();
      case MyDslPackage.CONTROL_VARIABLES: return createControlVariables();
      case MyDslPackage.DEPENDENT_VARIABLES: return createDependentVariables();
      case MyDslPackage.FACTOR_LEVELS: return createFactorLevels();
      case MyDslPackage.RESPONSE: return createResponse();
      case MyDslPackage.ITERATION: return createIteration();
      case MyDslPackage.PERFORMANCE_MEASURE: return createPerformanceMeasure();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyDslPackage.VARIABLE_TYPE:
        return createVariableTypeFromString(eDataType, initialValue);
      case MyDslPackage.EXPRESSION:
        return createExpressionFromString(eDataType, initialValue);
      case MyDslPackage.LINKS:
        return createLinksFromString(eDataType, initialValue);
      case MyDslPackage.TEMPORAL:
        return createTemporalFromString(eDataType, initialValue);
      case MyDslPackage.LOGICAL:
        return createLogicalFromString(eDataType, initialValue);
      case MyDslPackage.COHERENCE:
        return createCoherenceFromString(eDataType, initialValue);
      case MyDslPackage.FUNCTION:
        return createFunctionFromString(eDataType, initialValue);
      case MyDslPackage.CHANGES:
        return createChangesFromString(eDataType, initialValue);
      case MyDslPackage.LEVELS:
        return createLevelsFromString(eDataType, initialValue);
      case MyDslPackage.DESIGN_TYPE:
        return createDesignTypeFromString(eDataType, initialValue);
      case MyDslPackage.RESPONSE_TYPE:
        return createResponseTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyDslPackage.VARIABLE_TYPE:
        return convertVariableTypeToString(eDataType, instanceValue);
      case MyDslPackage.EXPRESSION:
        return convertExpressionToString(eDataType, instanceValue);
      case MyDslPackage.LINKS:
        return convertLinksToString(eDataType, instanceValue);
      case MyDslPackage.TEMPORAL:
        return convertTemporalToString(eDataType, instanceValue);
      case MyDslPackage.LOGICAL:
        return convertLogicalToString(eDataType, instanceValue);
      case MyDslPackage.COHERENCE:
        return convertCoherenceToString(eDataType, instanceValue);
      case MyDslPackage.FUNCTION:
        return convertFunctionToString(eDataType, instanceValue);
      case MyDslPackage.CHANGES:
        return convertChangesToString(eDataType, instanceValue);
      case MyDslPackage.LEVELS:
        return convertLevelsToString(eDataType, instanceValue);
      case MyDslPackage.DESIGN_TYPE:
        return convertDesignTypeToString(eDataType, instanceValue);
      case MyDslPackage.RESPONSE_TYPE:
        return convertResponseTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExperimentOntology createExperimentOntology()
  {
    ExperimentOntologyImpl experimentOntology = new ExperimentOntologyImpl();
    return experimentOntology;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelSection createModelSection()
  {
    ModelSectionImpl modelSection = new ModelSectionImpl();
    return modelSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mechanism createMechanism()
  {
    MechanismImpl mechanism = new MechanismImpl();
    return mechanism;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reaction createReaction()
  {
    ReactionImpl reaction = new ReactionImpl();
    return reaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuardCondition createGuardCondition()
  {
    GuardConditionImpl guardCondition = new GuardConditionImpl();
    return guardCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDescriptor createEventDescriptor()
  {
    EventDescriptorImpl eventDescriptor = new EventDescriptorImpl();
    return eventDescriptor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factor createFactor()
  {
    FactorImpl factor = new FactorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public properties createproperties()
  {
    propertiesImpl properties = new propertiesImpl();
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Values createValues()
  {
    ValuesImpl values = new ValuesImpl();
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goals createGoals()
  {
    GoalsImpl goals = new GoalsImpl();
    return goals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hypothesis createHypothesis()
  {
    HypothesisImpl hypothesis = new HypothesisImpl();
    return hypothesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoherenceLink createCoherenceLink()
  {
    CoherenceLinkImpl coherenceLink = new CoherenceLinkImpl();
    return coherenceLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MechHypothesis createMechHypothesis()
  {
    MechHypothesisImpl mechHypothesis = new MechHypothesisImpl();
    return mechHypothesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evidence createEvidence()
  {
    EvidenceImpl evidence = new EvidenceImpl();
    return evidence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemporalPattern createTemporalPattern()
  {
    TemporalPatternImpl temporalPattern = new TemporalPatternImpl();
    return temporalPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Simultaneous createSimultaneous()
  {
    SimultaneousImpl simultaneous = new SimultaneousImpl();
    return simultaneous;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dispersed createDispersed()
  {
    DispersedImpl dispersed = new DispersedImpl();
    return dispersed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalQuery createRelationalQuery()
  {
    RelationalQueryImpl relationalQuery = new RelationalQueryImpl();
    return relationalQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query1 createQuery1()
  {
    Query1Impl query1 = new Query1Impl();
    return query1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query2 createQuery2()
  {
    Query2Impl query2 = new Query2Impl();
    return query2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query3 createQuery3()
  {
    Query3Impl query3 = new Query3Impl();
    return query3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Experiment createExperiment()
  {
    ExperimentImpl experiment = new ExperimentImpl();
    return experiment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Design createDesign()
  {
    DesignImpl design = new DesignImpl();
    return design;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variables createVariables()
  {
    VariablesImpl variables = new VariablesImpl();
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndependentVariables createIndependentVariables()
  {
    IndependentVariablesImpl independentVariables = new IndependentVariablesImpl();
    return independentVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlVariables createControlVariables()
  {
    ControlVariablesImpl controlVariables = new ControlVariablesImpl();
    return controlVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependentVariables createDependentVariables()
  {
    DependentVariablesImpl dependentVariables = new DependentVariablesImpl();
    return dependentVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactorLevels createFactorLevels()
  {
    FactorLevelsImpl factorLevels = new FactorLevelsImpl();
    return factorLevels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Response createResponse()
  {
    ResponseImpl response = new ResponseImpl();
    return response;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iteration createIteration()
  {
    IterationImpl iteration = new IterationImpl();
    return iteration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PerformanceMeasure createPerformanceMeasure()
  {
    PerformanceMeasureImpl performanceMeasure = new PerformanceMeasureImpl();
    return performanceMeasure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType createVariableTypeFromString(EDataType eDataType, String initialValue)
  {
    VariableType result = VariableType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVariableTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpressionFromString(EDataType eDataType, String initialValue)
  {
    Expression result = Expression.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertExpressionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Links createLinksFromString(EDataType eDataType, String initialValue)
  {
    Links result = Links.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLinksToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Temporal createTemporalFromString(EDataType eDataType, String initialValue)
  {
    Temporal result = Temporal.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTemporalToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Logical createLogicalFromString(EDataType eDataType, String initialValue)
  {
    Logical result = Logical.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogicalToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coherence createCoherenceFromString(EDataType eDataType, String initialValue)
  {
    Coherence result = Coherence.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCoherenceToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunctionFromString(EDataType eDataType, String initialValue)
  {
    Function result = Function.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFunctionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Changes createChangesFromString(EDataType eDataType, String initialValue)
  {
    Changes result = Changes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertChangesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Levels createLevelsFromString(EDataType eDataType, String initialValue)
  {
    Levels result = Levels.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLevelsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DesignType createDesignTypeFromString(EDataType eDataType, String initialValue)
  {
    DesignType result = DesignType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDesignTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResponseType createResponseTypeFromString(EDataType eDataType, String initialValue)
  {
    ResponseType result = ResponseType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertResponseTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
