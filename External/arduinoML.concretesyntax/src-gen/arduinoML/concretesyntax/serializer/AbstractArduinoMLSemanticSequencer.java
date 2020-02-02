/*
 * generated by Xtext
 */
package arduinoML.concretesyntax.serializer;

import arduinoML.Actuator;
import arduinoML.App;
import arduinoML.ArduinoMLPackage;
import arduinoML.BaseCondition;
import arduinoML.BooleanCondition;
import arduinoML.Sensor;
import arduinoML.SinkError;
import arduinoML.State;
import arduinoML.Transition;
import arduinoML.concretesyntax.services.ArduinoMLGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractArduinoMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ArduinoMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ArduinoMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ArduinoMLPackage.ACTION:
				sequence_Action(context, (arduinoML.Action) semanticObject); 
				return; 
			case ArduinoMLPackage.ACTUATOR:
				if (rule == grammarAccess.getActuatorRule()) {
					sequence_Actuator(context, (Actuator) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getBrickRule()) {
					sequence_Actuator_Brick(context, (Actuator) semanticObject); 
					return; 
				}
				else break;
			case ArduinoMLPackage.APP:
				sequence_App(context, (App) semanticObject); 
				return; 
			case ArduinoMLPackage.BASE_CONDITION:
				sequence_BaseCondition(context, (BaseCondition) semanticObject); 
				return; 
			case ArduinoMLPackage.BOOLEAN_CONDITION:
				sequence_BooleanCondition(context, (BooleanCondition) semanticObject); 
				return; 
			case ArduinoMLPackage.SENSOR:
				if (rule == grammarAccess.getBrickRule()) {
					sequence_Brick_Sensor(context, (Sensor) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSensorRule()) {
					sequence_Sensor(context, (Sensor) semanticObject); 
					return; 
				}
				else break;
			case ArduinoMLPackage.SINK_ERROR:
				sequence_SinkError(context, (SinkError) semanticObject); 
				return; 
			case ArduinoMLPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case ArduinoMLPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (actuator=[Actuator|EString] (value=Signal | analogvalue=EInt))
	 */
	protected void sequence_Action(ISerializationContext context, arduinoML.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Actuator returns Actuator
	 *
	 * Constraint:
	 *     {Actuator}
	 */
	protected void sequence_Actuator(ISerializationContext context, Actuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Brick returns Actuator
	 *
	 * Constraint:
	 *     (type=Type name=EString pin=EInt)
	 */
	protected void sequence_Actuator_Brick(ISerializationContext context, Actuator semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.BRICK__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.BRICK__TYPE));
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.BRICK__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.BRICK__PIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBrickAccess().getTypeTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_4_0(), semanticObject.getPin());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     App returns App
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         initial=[State|EString] 
	 *         bricks+=Brick 
	 *         bricks+=Brick* 
	 *         states+=State 
	 *         states+=State*
	 *     )
	 */
	protected void sequence_App(ISerializationContext context, App semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BaseCondition returns BaseCondition
	 *
	 * Constraint:
	 *     (sensor=[Sensor|EString] comparator=Comparator (value=Signal | analogvalue=EInt))
	 */
	protected void sequence_BaseCondition(ISerializationContext context, BaseCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BooleanCondition returns BooleanCondition
	 *
	 * Constraint:
	 *     (operator=Operator sensor=[Sensor|EString] comparator=Comparator (value=Signal | analogvalue=EInt))
	 */
	protected void sequence_BooleanCondition(ISerializationContext context, BooleanCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Brick returns Sensor
	 *
	 * Constraint:
	 *     (type=Type name=EString pin=EInt)
	 */
	protected void sequence_Brick_Sensor(ISerializationContext context, Sensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.BRICK__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.BRICK__TYPE));
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, ArduinoMLPackage.Literals.BRICK__PIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArduinoMLPackage.Literals.BRICK__PIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBrickAccess().getTypeTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_4_0(), semanticObject.getPin());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     {Sensor}
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SinkError returns SinkError
	 *
	 * Constraint:
	 *     (basecondition=BaseCondition booleancondition+=BooleanCondition* value=EInt)
	 */
	protected void sequence_SinkError(ISerializationContext context, SinkError semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         actions+=Action 
	 *         actions+=Action* 
	 *         errors+=SinkError* 
	 *         transitions+=Transition 
	 *         transitions+=Transition*
	 *     )
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (basecondition=BaseCondition booleancondition+=BooleanCondition* next=[State|EString])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
