/*
 * generated by Xtext
 */
grammar InternalArduinoML;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package arduinoML.concretesyntax.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package arduinoML.concretesyntax.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import arduinoML.concretesyntax.services.ArduinoMLGrammarAccess;

}

@parser::members {

 	private ArduinoMLGrammarAccess grammarAccess;
 	
    public InternalArduinoMLParser(TokenStream input, ArduinoMLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "App";	
   	}
   	
   	@Override
   	protected ArduinoMLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleApp
entryRuleApp returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAppRule()); }
	 iv_ruleApp=ruleApp 
	 { $current=$iv_ruleApp.current; } 
	 EOF 
;

// Rule App
ruleApp returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='app' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAppRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"arduinoML.concretesyntax.ArduinoML.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='initial state' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAppAccess().getInitialStateKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAppRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAppAccess().getInitialStateCrossReference_3_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_4());
    }
	otherlv_5='bricks' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAppAccess().getBricksKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_6_0()); 
	    }
		lv_bricks_6_0=ruleBrick		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAppRule());
	        }
       		add(
       			$current, 
       			"bricks",
        		lv_bricks_6_0, 
        		"arduinoML.concretesyntax.ArduinoML.Brick");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0()); 
	    }
		lv_bricks_7_0=ruleBrick		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAppRule());
	        }
       		add(
       			$current, 
       			"bricks",
        		lv_bricks_7_0, 
        		"arduinoML.concretesyntax.ArduinoML.Brick");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='states' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getAppAccess().getStatesKeyword_8());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_9_0()); 
	    }
		lv_states_9_0=ruleState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAppRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_9_0, 
        		"arduinoML.concretesyntax.ArduinoML.State");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_10_0()); 
	    }
		lv_states_10_0=ruleState		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAppRule());
	        }
       		add(
       			$current, 
       			"states",
        		lv_states_10_0, 
        		"arduinoML.concretesyntax.ArduinoML.State");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_11());
    }
)
;





// Entry rule entryRuleBrick
entryRuleBrick returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBrickRule()); }
	 iv_ruleBrick=ruleBrick 
	 { $current=$iv_ruleBrick.current; } 
	 EOF 
;

// Rule Brick
ruleBrick returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    { 
        newCompositeNode(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_0()); 
    }
    this_Sensor_0=ruleSensor
    { 
        $current = $this_Sensor_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_1()); 
    }
    this_Actuator_1=ruleActuator
    { 
        $current = $this_Actuator_1.current; 
        afterParserOrEnumRuleCall();
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBrickAccess().getTypeTypeEnumRuleCall_1_0()); 
	    }
		lv_type_2_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBrickRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"arduinoML.concretesyntax.ArduinoML.Type");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBrickRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"arduinoML.concretesyntax.ArduinoML.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=':' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBrickAccess().getColonKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_4_0()); 
	    }
		lv_pin_5_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBrickRule());
	        }
       		set(
       			$current, 
       			"pin",
        		lv_pin_5_0, 
        		"arduinoML.concretesyntax.ArduinoML.EInt");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleActuator
entryRuleActuator returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActuatorRule()); }
	 iv_ruleActuator=ruleActuator 
	 { $current=$iv_ruleActuator.current; } 
	 EOF 
;

// Rule Actuator
ruleActuator returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getActuatorAccess().getActuatorAction_0(),
            $current);
    }
)	otherlv_1='Actuator' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
    }
)
;





// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSensorRule()); }
	 iv_ruleSensor=ruleSensor 
	 { $current=$iv_ruleSensor.current; } 
	 EOF 
;

// Rule Sensor
ruleSensor returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSensorAccess().getSensorAction_0(),
            $current);
    }
)	otherlv_1='Sensor' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntRule()); } 
	 iv_ruleEInt=ruleEInt 
	 { $current=$iv_ruleEInt.current.getText(); }  
	 EOF 
;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleState
entryRuleState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	 iv_ruleState=ruleState 
	 { $current=$iv_ruleState.current; } 
	 EOF 
;

// Rule State
ruleState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"arduinoML.concretesyntax.ArduinoML.EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0()); 
	    }
		lv_actions_2_0=ruleAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		add(
       			$current, 
       			"actions",
        		lv_actions_2_0, 
        		"arduinoML.concretesyntax.ArduinoML.Action");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0()); 
	    }
		lv_actions_3_0=ruleAction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		add(
       			$current, 
       			"actions",
        		lv_actions_3_0, 
        		"arduinoML.concretesyntax.ArduinoML.Action");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getErrorsSinkErrorParserRuleCall_4_0()); 
	    }
		lv_errors_4_0=ruleSinkError		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		add(
       			$current, 
       			"errors",
        		lv_errors_4_0, 
        		"arduinoML.concretesyntax.ArduinoML.SinkError");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0()); 
	    }
		lv_transitions_5_0=ruleTransition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		add(
       			$current, 
       			"transitions",
        		lv_transitions_5_0, 
        		"arduinoML.concretesyntax.ArduinoML.Transition");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_6_0()); 
	    }
		lv_transitions_6_0=ruleTransition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateRule());
	        }
       		add(
       			$current, 
       			"transitions",
        		lv_transitions_6_0, 
        		"arduinoML.concretesyntax.ArduinoML.Transition");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	 iv_ruleAction=ruleAction 
	 { $current=$iv_ruleAction.current; } 
	 EOF 
;

// Rule Action
ruleAction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_0_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getEqualsSignKeyword_1());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getActionAccess().getValueSignalEnumRuleCall_2_0_0()); 
	    }
		lv_value_2_0=ruleSignal		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActionRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"arduinoML.concretesyntax.ArduinoML.Signal");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getActionAccess().getAnalogvalueEIntParserRuleCall_2_1_0()); 
	    }
		lv_analogvalue_3_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActionRule());
	        }
       		set(
       			$current, 
       			"analogvalue",
        		lv_analogvalue_3_0, 
        		"arduinoML.concretesyntax.ArduinoML.EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	 iv_ruleTransition=ruleTransition 
	 { $current=$iv_ruleTransition.current; } 
	 EOF 
;

// Rule Transition
ruleTransition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getIfKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTransitionAccess().getBaseconditionBaseConditionParserRuleCall_2_0()); 
	    }
		lv_basecondition_2_0=ruleBaseCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransitionRule());
	        }
       		set(
       			$current, 
       			"basecondition",
        		lv_basecondition_2_0, 
        		"arduinoML.concretesyntax.ArduinoML.BaseCondition");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTransitionAccess().getBooleanconditionBooleanConditionParserRuleCall_4_0()); 
	    }
		lv_booleancondition_4_0=ruleBooleanCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransitionRule());
	        }
       		add(
       			$current, 
       			"booleancondition",
        		lv_booleancondition_4_0, 
        		"arduinoML.concretesyntax.ArduinoML.BooleanCondition");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='=>' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_5());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransitionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_6_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleBaseCondition
entryRuleBaseCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBaseConditionRule()); }
	 iv_ruleBaseCondition=ruleBaseCondition 
	 { $current=$iv_ruleBaseCondition.current; } 
	 EOF 
;

// Rule BaseCondition
ruleBaseCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getBaseConditionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getBaseConditionAccess().getSensorSensorCrossReference_0_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBaseConditionAccess().getComparatorComparatorEnumRuleCall_1_0()); 
	    }
		lv_comparator_1_0=ruleComparator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBaseConditionRule());
	        }
       		set(
       			$current, 
       			"comparator",
        		lv_comparator_1_0, 
        		"arduinoML.concretesyntax.ArduinoML.Comparator");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getBaseConditionAccess().getValueSignalEnumRuleCall_2_0_0()); 
	    }
		lv_value_2_0=ruleSignal		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBaseConditionRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"arduinoML.concretesyntax.ArduinoML.Signal");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getBaseConditionAccess().getAnalogvalueEIntParserRuleCall_2_1_0()); 
	    }
		lv_analogvalue_3_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBaseConditionRule());
	        }
       		set(
       			$current, 
       			"analogvalue",
        		lv_analogvalue_3_0, 
        		"arduinoML.concretesyntax.ArduinoML.EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;





// Entry rule entryRuleBooleanCondition
entryRuleBooleanCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanConditionRule()); }
	 iv_ruleBooleanCondition=ruleBooleanCondition 
	 { $current=$iv_ruleBooleanCondition.current; } 
	 EOF 
;

// Rule BooleanCondition
ruleBooleanCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getOperatorOperatorEnumRuleCall_0_0()); 
	    }
		lv_operator_0_0=ruleOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_0_0, 
        		"arduinoML.concretesyntax.ArduinoML.Operator");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getBooleanConditionAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanConditionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getSensorSensorCrossReference_2_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getComparatorComparatorEnumRuleCall_3_0()); 
	    }
		lv_comparator_3_0=ruleComparator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
	        }
       		set(
       			$current, 
       			"comparator",
        		lv_comparator_3_0, 
        		"arduinoML.concretesyntax.ArduinoML.Comparator");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getValueSignalEnumRuleCall_4_0_0()); 
	    }
		lv_value_4_0=ruleSignal		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_4_0, 
        		"arduinoML.concretesyntax.ArduinoML.Signal");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getBooleanConditionAccess().getAnalogvalueEIntParserRuleCall_4_1_0()); 
	    }
		lv_analogvalue_5_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
	        }
       		set(
       			$current, 
       			"analogvalue",
        		lv_analogvalue_5_0, 
        		"arduinoML.concretesyntax.ArduinoML.EInt");
	        afterParserOrEnumRuleCall();
	    }

)
))	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getBooleanConditionAccess().getRightParenthesisKeyword_5());
    }
)
;





// Entry rule entryRuleSinkError
entryRuleSinkError returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSinkErrorRule()); }
	 iv_ruleSinkError=ruleSinkError 
	 { $current=$iv_ruleSinkError.current; } 
	 EOF 
;

// Rule SinkError
ruleSinkError returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSinkErrorAccess().getIfKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSinkErrorAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSinkErrorAccess().getBaseconditionBaseConditionParserRuleCall_2_0()); 
	    }
		lv_basecondition_2_0=ruleBaseCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSinkErrorRule());
	        }
       		set(
       			$current, 
       			"basecondition",
        		lv_basecondition_2_0, 
        		"arduinoML.concretesyntax.ArduinoML.BaseCondition");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSinkErrorAccess().getRightParenthesisKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSinkErrorAccess().getBooleanconditionBooleanConditionParserRuleCall_4_0()); 
	    }
		lv_booleancondition_4_0=ruleBooleanCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSinkErrorRule());
	        }
       		add(
       			$current, 
       			"booleancondition",
        		lv_booleancondition_4_0, 
        		"arduinoML.concretesyntax.ArduinoML.BooleanCondition");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='=>' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSinkErrorAccess().getEqualsSignGreaterThanSignKeyword_5());
    }
	otherlv_6='error' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getSinkErrorAccess().getErrorKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSinkErrorAccess().getValueEIntParserRuleCall_7_0()); 
	    }
		lv_value_7_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSinkErrorRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_7_0, 
        		"arduinoML.concretesyntax.ArduinoML.EInt");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Rule Signal
ruleSignal returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='HIGH' 
	{
        $current = grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getSignalAccess().getHIGHEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='LOW' 
	{
        $current = grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getSignalAccess().getLOWEnumLiteralDeclaration_1()); 
    }
));



// Rule Operator
ruleOperator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='AND' 
	{
        $current = grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getANDEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='OR' 
	{
        $current = grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getOREnumLiteralDeclaration_1()); 
    }
));



// Rule Comparator
ruleComparator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='>' 
	{
        $current = grammarAccess.getComparatorAccess().getSupEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getComparatorAccess().getSupEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='<' 
	{
        $current = grammarAccess.getComparatorAccess().getInfEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getComparatorAccess().getInfEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='==' 
	{
        $current = grammarAccess.getComparatorAccess().getEquEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getComparatorAccess().getEquEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='>=' 
	{
        $current = grammarAccess.getComparatorAccess().getEsupEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getComparatorAccess().getEsupEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='<=' 
	{
        $current = grammarAccess.getComparatorAccess().getEinfEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getComparatorAccess().getEinfEnumLiteralDeclaration_4()); 
    }
));



// Rule Type
ruleType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='analog' 
	{
        $current = grammarAccess.getTypeAccess().getAnalogEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getAnalogEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='digital' 
	{
        $current = grammarAccess.getTypeAccess().getDigitalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getDigitalEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


