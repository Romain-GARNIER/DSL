/*
 * generated by Xtext
 */
package arduinoML.concretesyntax.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ArduinoMLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class AppElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.App");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAppKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cInitialStateKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInitialAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cInitialStateCrossReference_3_0 = (CrossReference)cInitialAssignment_3.eContents().get(0);
		private final RuleCall cInitialStateEStringParserRuleCall_3_0_1 = (RuleCall)cInitialStateCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cBricksKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBricksAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBricksBrickParserRuleCall_6_0 = (RuleCall)cBricksAssignment_6.eContents().get(0);
		private final Assignment cBricksAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cBricksBrickParserRuleCall_7_0 = (RuleCall)cBricksAssignment_7.eContents().get(0);
		private final Keyword cStatesKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cStatesAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cStatesStateParserRuleCall_9_0 = (RuleCall)cStatesAssignment_9.eContents().get(0);
		private final Assignment cStatesAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cStatesStateParserRuleCall_10_0 = (RuleCall)cStatesAssignment_10.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//App:
		//	'app' name=EString 'initial state' initial=[State|EString]
		//	'{'
		//	'bricks' bricks+=Brick bricks+=Brick*
		//	'states' states+=State states+=State*
		//	'}';
		@Override public ParserRule getRule() { return rule; }

		//'app' name=EString 'initial state' initial=[State|EString] '{' 'bricks' bricks+=Brick bricks+=Brick* 'states'
		//states+=State states+=State* '}'
		public Group getGroup() { return cGroup; }

		//'app'
		public Keyword getAppKeyword_0() { return cAppKeyword_0; }

		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }

		//'initial state'
		public Keyword getInitialStateKeyword_2() { return cInitialStateKeyword_2; }

		//initial=[State|EString]
		public Assignment getInitialAssignment_3() { return cInitialAssignment_3; }

		//[State|EString]
		public CrossReference getInitialStateCrossReference_3_0() { return cInitialStateCrossReference_3_0; }

		//EString
		public RuleCall getInitialStateEStringParserRuleCall_3_0_1() { return cInitialStateEStringParserRuleCall_3_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//'bricks'
		public Keyword getBricksKeyword_5() { return cBricksKeyword_5; }

		//bricks+=Brick
		public Assignment getBricksAssignment_6() { return cBricksAssignment_6; }

		//Brick
		public RuleCall getBricksBrickParserRuleCall_6_0() { return cBricksBrickParserRuleCall_6_0; }

		//bricks+=Brick*
		public Assignment getBricksAssignment_7() { return cBricksAssignment_7; }

		//Brick
		public RuleCall getBricksBrickParserRuleCall_7_0() { return cBricksBrickParserRuleCall_7_0; }

		//'states'
		public Keyword getStatesKeyword_8() { return cStatesKeyword_8; }

		//states+=State
		public Assignment getStatesAssignment_9() { return cStatesAssignment_9; }

		//State
		public RuleCall getStatesStateParserRuleCall_9_0() { return cStatesStateParserRuleCall_9_0; }

		//states+=State*
		public Assignment getStatesAssignment_10() { return cStatesAssignment_10; }

		//State
		public RuleCall getStatesStateParserRuleCall_10_0() { return cStatesStateParserRuleCall_10_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}

	public class BrickElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Brick");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cSensorParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cActuatorParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPinAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPinEIntParserRuleCall_3_0 = (RuleCall)cPinAssignment_3.eContents().get(0);
		
		//Brick:
		//	(Sensor | Actuator) name=EString ':' pin=EInt;
		@Override public ParserRule getRule() { return rule; }

		//(Sensor | Actuator) name=EString ':' pin=EInt
		public Group getGroup() { return cGroup; }

		//(Sensor | Actuator)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//Sensor
		public RuleCall getSensorParserRuleCall_0_0() { return cSensorParserRuleCall_0_0; }

		//Actuator
		public RuleCall getActuatorParserRuleCall_0_1() { return cActuatorParserRuleCall_0_1; }

		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }

		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//pin=EInt
		public Assignment getPinAssignment_3() { return cPinAssignment_3; }

		//EInt
		public RuleCall getPinEIntParserRuleCall_3_0() { return cPinEIntParserRuleCall_3_0; }
	}

	public class ActuatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Actuator");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActuatorAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActuatorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Actuator:
		//	{Actuator}
		//	'Actuator';
		@Override public ParserRule getRule() { return rule; }

		//{Actuator} 'Actuator'
		public Group getGroup() { return cGroup; }

		//{Actuator}
		public Action getActuatorAction_0() { return cActuatorAction_0; }

		//'Actuator'
		public Keyword getActuatorKeyword_1() { return cActuatorKeyword_1; }
	}

	public class SensorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Sensor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSensorAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSensorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Sensor:
		//	{Sensor}
		//	'Sensor';
		@Override public ParserRule getRule() { return rule; }

		//{Sensor} 'Sensor'
		public Group getGroup() { return cGroup; }

		//{Sensor}
		public Action getSensorAction_0() { return cSensorAction_0; }

		//'Sensor'
		public Keyword getSensorKeyword_1() { return cSensorKeyword_1; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }

		//'-'? INT
		public Group getGroup() { return cGroup; }

		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}

	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameEStringParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cErrorsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cErrorsSinkErrorParserRuleCall_2_0 = (RuleCall)cErrorsAssignment_2.eContents().get(0);
		private final Assignment cActionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cActionsActionParserRuleCall_3_0 = (RuleCall)cActionsAssignment_3.eContents().get(0);
		private final Assignment cActionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cActionsActionParserRuleCall_4_0 = (RuleCall)cActionsAssignment_4.eContents().get(0);
		private final Assignment cTransitionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTransitionsTransitionParserRuleCall_5_0 = (RuleCall)cTransitionsAssignment_5.eContents().get(0);
		private final Assignment cTransitionsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTransitionsTransitionParserRuleCall_6_0 = (RuleCall)cTransitionsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//State:
		//	name=EString
		//	'{'
		//	errors+=SinkError*
		//	actions+=Action actions+=Action*
		//	transitions+=Transition transitions+=Transition*
		//	'}';
		@Override public ParserRule getRule() { return rule; }

		//name=EString '{' errors+=SinkError* actions+=Action actions+=Action* transitions+=Transition transitions+=Transition*
		//'}'
		public Group getGroup() { return cGroup; }

		//name=EString
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//EString
		public RuleCall getNameEStringParserRuleCall_0_0() { return cNameEStringParserRuleCall_0_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//errors+=SinkError*
		public Assignment getErrorsAssignment_2() { return cErrorsAssignment_2; }

		//SinkError
		public RuleCall getErrorsSinkErrorParserRuleCall_2_0() { return cErrorsSinkErrorParserRuleCall_2_0; }

		//actions+=Action
		public Assignment getActionsAssignment_3() { return cActionsAssignment_3; }

		//Action
		public RuleCall getActionsActionParserRuleCall_3_0() { return cActionsActionParserRuleCall_3_0; }

		//actions+=Action*
		public Assignment getActionsAssignment_4() { return cActionsAssignment_4; }

		//Action
		public RuleCall getActionsActionParserRuleCall_4_0() { return cActionsActionParserRuleCall_4_0; }

		//transitions+=Transition
		public Assignment getTransitionsAssignment_5() { return cTransitionsAssignment_5; }

		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_5_0() { return cTransitionsTransitionParserRuleCall_5_0; }

		//transitions+=Transition*
		public Assignment getTransitionsAssignment_6() { return cTransitionsAssignment_6; }

		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_6_0() { return cTransitionsTransitionParserRuleCall_6_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cActuatorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cActuatorActuatorCrossReference_0_0 = (CrossReference)cActuatorAssignment_0.eContents().get(0);
		private final RuleCall cActuatorActuatorEStringParserRuleCall_0_0_1 = (RuleCall)cActuatorActuatorCrossReference_0_0.eContents().get(1);
		private final Keyword cLessThanSignEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSignalEnumRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Action:
		//	actuator=[Actuator|EString] '<=' value=Signal;
		@Override public ParserRule getRule() { return rule; }

		//actuator=[Actuator|EString] '<=' value=Signal
		public Group getGroup() { return cGroup; }

		//actuator=[Actuator|EString]
		public Assignment getActuatorAssignment_0() { return cActuatorAssignment_0; }

		//[Actuator|EString]
		public CrossReference getActuatorActuatorCrossReference_0_0() { return cActuatorActuatorCrossReference_0_0; }

		//EString
		public RuleCall getActuatorActuatorEStringParserRuleCall_0_0_1() { return cActuatorActuatorEStringParserRuleCall_0_0_1; }

		//'<='
		public Keyword getLessThanSignEqualsSignKeyword_1() { return cLessThanSignEqualsSignKeyword_1; }

		//value=Signal
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//Signal
		public RuleCall getValueSignalEnumRuleCall_2_0() { return cValueSignalEnumRuleCall_2_0; }
	}

	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBaseconditionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBaseconditionBaseConditionParserRuleCall_2_0 = (RuleCall)cBaseconditionAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBooleanconditionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBooleanconditionBooleanConditionParserRuleCall_4_0 = (RuleCall)cBooleanconditionAssignment_4.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cNextAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cNextStateCrossReference_6_0 = (CrossReference)cNextAssignment_6.eContents().get(0);
		private final RuleCall cNextStateEStringParserRuleCall_6_0_1 = (RuleCall)cNextStateCrossReference_6_0.eContents().get(1);
		
		//Transition:
		//	'if' '(' basecondition=BaseCondition ')' booleancondition+=BooleanCondition* '=>' next=[State|EString];
		@Override public ParserRule getRule() { return rule; }

		//'if' '(' basecondition=BaseCondition ')' booleancondition+=BooleanCondition* '=>' next=[State|EString]
		public Group getGroup() { return cGroup; }

		//'if'
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//basecondition=BaseCondition
		public Assignment getBaseconditionAssignment_2() { return cBaseconditionAssignment_2; }

		//BaseCondition
		public RuleCall getBaseconditionBaseConditionParserRuleCall_2_0() { return cBaseconditionBaseConditionParserRuleCall_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//booleancondition+=BooleanCondition*
		public Assignment getBooleanconditionAssignment_4() { return cBooleanconditionAssignment_4; }

		//BooleanCondition
		public RuleCall getBooleanconditionBooleanConditionParserRuleCall_4_0() { return cBooleanconditionBooleanConditionParserRuleCall_4_0; }

		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_5() { return cEqualsSignGreaterThanSignKeyword_5; }

		//next=[State|EString]
		public Assignment getNextAssignment_6() { return cNextAssignment_6; }

		//[State|EString]
		public CrossReference getNextStateCrossReference_6_0() { return cNextStateCrossReference_6_0; }

		//EString
		public RuleCall getNextStateEStringParserRuleCall_6_0_1() { return cNextStateEStringParserRuleCall_6_0_1; }
	}

	public class BaseConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.BaseCondition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSensorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cSensorSensorCrossReference_0_0 = (CrossReference)cSensorAssignment_0.eContents().get(0);
		private final RuleCall cSensorSensorEStringParserRuleCall_0_0_1 = (RuleCall)cSensorSensorCrossReference_0_0.eContents().get(1);
		private final Keyword cIsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSignalEnumRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//BaseCondition:
		//	sensor=[Sensor|EString] 'is' value=Signal;
		@Override public ParserRule getRule() { return rule; }

		//sensor=[Sensor|EString] 'is' value=Signal
		public Group getGroup() { return cGroup; }

		//sensor=[Sensor|EString]
		public Assignment getSensorAssignment_0() { return cSensorAssignment_0; }

		//[Sensor|EString]
		public CrossReference getSensorSensorCrossReference_0_0() { return cSensorSensorCrossReference_0_0; }

		//EString
		public RuleCall getSensorSensorEStringParserRuleCall_0_0_1() { return cSensorSensorEStringParserRuleCall_0_0_1; }

		//'is'
		public Keyword getIsKeyword_1() { return cIsKeyword_1; }

		//value=Signal
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//Signal
		public RuleCall getValueSignalEnumRuleCall_2_0() { return cValueSignalEnumRuleCall_2_0; }
	}

	public class BooleanConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.BooleanCondition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOperatorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOperatorOperatorEnumRuleCall_0_0 = (RuleCall)cOperatorAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSensorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cSensorSensorCrossReference_2_0 = (CrossReference)cSensorAssignment_2.eContents().get(0);
		private final RuleCall cSensorSensorEStringParserRuleCall_2_0_1 = (RuleCall)cSensorSensorCrossReference_2_0.eContents().get(1);
		private final Keyword cIsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueSignalEnumRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//BooleanCondition:
		//	operator=Operator '(' sensor=[Sensor|EString] 'is' value=Signal ')';
		@Override public ParserRule getRule() { return rule; }

		//operator=Operator '(' sensor=[Sensor|EString] 'is' value=Signal ')'
		public Group getGroup() { return cGroup; }

		//operator=Operator
		public Assignment getOperatorAssignment_0() { return cOperatorAssignment_0; }

		//Operator
		public RuleCall getOperatorOperatorEnumRuleCall_0_0() { return cOperatorOperatorEnumRuleCall_0_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//sensor=[Sensor|EString]
		public Assignment getSensorAssignment_2() { return cSensorAssignment_2; }

		//[Sensor|EString]
		public CrossReference getSensorSensorCrossReference_2_0() { return cSensorSensorCrossReference_2_0; }

		//EString
		public RuleCall getSensorSensorEStringParserRuleCall_2_0_1() { return cSensorSensorEStringParserRuleCall_2_0_1; }

		//'is'
		public Keyword getIsKeyword_3() { return cIsKeyword_3; }

		//value=Signal
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }

		//Signal
		public RuleCall getValueSignalEnumRuleCall_4_0() { return cValueSignalEnumRuleCall_4_0; }

		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class SinkErrorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.SinkError");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cBaseconditionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBaseconditionBaseConditionParserRuleCall_2_0 = (RuleCall)cBaseconditionAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBooleanconditionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBooleanconditionBooleanConditionParserRuleCall_4_0 = (RuleCall)cBooleanconditionAssignment_4.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cErrorKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cValueAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cValueEIntParserRuleCall_7_0 = (RuleCall)cValueAssignment_7.eContents().get(0);
		
		////(sensor=[Sensor|EString] 'is' value=Signal) ;
		//SinkError:
		//	'if' '(' basecondition=BaseCondition ')' booleancondition+=BooleanCondition* '=>' 'error' value=EInt;
		@Override public ParserRule getRule() { return rule; }

		//'if' '(' basecondition=BaseCondition ')' booleancondition+=BooleanCondition* '=>' 'error' value=EInt
		public Group getGroup() { return cGroup; }

		//'if'
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//basecondition=BaseCondition
		public Assignment getBaseconditionAssignment_2() { return cBaseconditionAssignment_2; }

		//BaseCondition
		public RuleCall getBaseconditionBaseConditionParserRuleCall_2_0() { return cBaseconditionBaseConditionParserRuleCall_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//booleancondition+=BooleanCondition*
		public Assignment getBooleanconditionAssignment_4() { return cBooleanconditionAssignment_4; }

		//BooleanCondition
		public RuleCall getBooleanconditionBooleanConditionParserRuleCall_4_0() { return cBooleanconditionBooleanConditionParserRuleCall_4_0; }

		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_5() { return cEqualsSignGreaterThanSignKeyword_5; }

		//'error'
		public Keyword getErrorKeyword_6() { return cErrorKeyword_6; }

		//value=EInt
		public Assignment getValueAssignment_7() { return cValueAssignment_7; }

		//EInt
		public RuleCall getValueEIntParserRuleCall_7_0() { return cValueEIntParserRuleCall_7_0; }
	}
	
	
	public class SignalElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Signal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cHIGHEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cHIGHHIGHKeyword_0_0 = (Keyword)cHIGHEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLOWEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLOWLOWKeyword_1_0 = (Keyword)cLOWEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Signal:
		//	HIGH | LOW;
		public EnumRule getRule() { return rule; }

		//HIGH | LOW
		public Alternatives getAlternatives() { return cAlternatives; }

		//HIGH
		public EnumLiteralDeclaration getHIGHEnumLiteralDeclaration_0() { return cHIGHEnumLiteralDeclaration_0; }

		//'HIGH'
		public Keyword getHIGHHIGHKeyword_0_0() { return cHIGHHIGHKeyword_0_0; }

		//LOW
		public EnumLiteralDeclaration getLOWEnumLiteralDeclaration_1() { return cLOWEnumLiteralDeclaration_1; }

		//'LOW'
		public Keyword getLOWLOWKeyword_1_0() { return cLOWLOWKeyword_1_0; }
	}

	public class OperatorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "arduinoML.concretesyntax.ArduinoML.Operator");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cANDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cANDANDKeyword_0_0 = (Keyword)cANDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cOREnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cORORKeyword_1_0 = (Keyword)cOREnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Operator:
		//	AND | OR;
		public EnumRule getRule() { return rule; }

		//AND | OR
		public Alternatives getAlternatives() { return cAlternatives; }

		//AND
		public EnumLiteralDeclaration getANDEnumLiteralDeclaration_0() { return cANDEnumLiteralDeclaration_0; }

		//'AND'
		public Keyword getANDANDKeyword_0_0() { return cANDANDKeyword_0_0; }

		//OR
		public EnumLiteralDeclaration getOREnumLiteralDeclaration_1() { return cOREnumLiteralDeclaration_1; }

		//'OR'
		public Keyword getORORKeyword_1_0() { return cORORKeyword_1_0; }
	}
	
	private final AppElements pApp;
	private final BrickElements pBrick;
	private final ActuatorElements pActuator;
	private final SensorElements pSensor;
	private final EStringElements pEString;
	private final EIntElements pEInt;
	private final StateElements pState;
	private final ActionElements pAction;
	private final TransitionElements pTransition;
	private final BaseConditionElements pBaseCondition;
	private final BooleanConditionElements pBooleanCondition;
	private final SinkErrorElements pSinkError;
	private final SignalElements eSignal;
	private final OperatorElements eOperator;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ArduinoMLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pApp = new AppElements();
		this.pBrick = new BrickElements();
		this.pActuator = new ActuatorElements();
		this.pSensor = new SensorElements();
		this.pEString = new EStringElements();
		this.pEInt = new EIntElements();
		this.pState = new StateElements();
		this.pAction = new ActionElements();
		this.pTransition = new TransitionElements();
		this.pBaseCondition = new BaseConditionElements();
		this.pBooleanCondition = new BooleanConditionElements();
		this.pSinkError = new SinkErrorElements();
		this.eSignal = new SignalElements();
		this.eOperator = new OperatorElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("arduinoML.concretesyntax.ArduinoML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//App:
	//	'app' name=EString 'initial state' initial=[State|EString]
	//	'{'
	//	'bricks' bricks+=Brick bricks+=Brick*
	//	'states' states+=State states+=State*
	//	'}';
	public AppElements getAppAccess() {
		return pApp;
	}
	
	public ParserRule getAppRule() {
		return getAppAccess().getRule();
	}

	//Brick:
	//	(Sensor | Actuator) name=EString ':' pin=EInt;
	public BrickElements getBrickAccess() {
		return pBrick;
	}
	
	public ParserRule getBrickRule() {
		return getBrickAccess().getRule();
	}

	//Actuator:
	//	{Actuator}
	//	'Actuator';
	public ActuatorElements getActuatorAccess() {
		return pActuator;
	}
	
	public ParserRule getActuatorRule() {
		return getActuatorAccess().getRule();
	}

	//Sensor:
	//	{Sensor}
	//	'Sensor';
	public SensorElements getSensorAccess() {
		return pSensor;
	}
	
	public ParserRule getSensorRule() {
		return getSensorAccess().getRule();
	}

	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}

	//State:
	//	name=EString
	//	'{'
	//	errors+=SinkError*
	//	actions+=Action actions+=Action*
	//	transitions+=Transition transitions+=Transition*
	//	'}';
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}

	//Action:
	//	actuator=[Actuator|EString] '<=' value=Signal;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}

	//Transition:
	//	'if' '(' basecondition=BaseCondition ')' booleancondition+=BooleanCondition* '=>' next=[State|EString];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}

	//BaseCondition:
	//	sensor=[Sensor|EString] 'is' value=Signal;
	public BaseConditionElements getBaseConditionAccess() {
		return pBaseCondition;
	}
	
	public ParserRule getBaseConditionRule() {
		return getBaseConditionAccess().getRule();
	}

	//BooleanCondition:
	//	operator=Operator '(' sensor=[Sensor|EString] 'is' value=Signal ')';
	public BooleanConditionElements getBooleanConditionAccess() {
		return pBooleanCondition;
	}
	
	public ParserRule getBooleanConditionRule() {
		return getBooleanConditionAccess().getRule();
	}

	////(sensor=[Sensor|EString] 'is' value=Signal) ;
	//SinkError:
	//	'if' '(' basecondition=BaseCondition ')' booleancondition+=BooleanCondition* '=>' 'error' value=EInt;
	public SinkErrorElements getSinkErrorAccess() {
		return pSinkError;
	}
	
	public ParserRule getSinkErrorRule() {
		return getSinkErrorAccess().getRule();
	}

	//enum Signal:
	//	HIGH | LOW;
	public SignalElements getSignalAccess() {
		return eSignal;
	}
	
	public EnumRule getSignalRule() {
		return getSignalAccess().getRule();
	}

	//enum Operator:
	//	AND | OR;
	public OperatorElements getOperatorAccess() {
		return eOperator;
	}
	
	public EnumRule getOperatorRule() {
		return getOperatorAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
