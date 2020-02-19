/*
 * generated by Xtext
 */
grammar InternalRythmML;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.rythmML.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.rythmML.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.rythmML.services.RythmMLGrammarAccess;

}

@parser::members {

 	private RythmMLGrammarAccess grammarAccess;
 	
    public InternalRythmMLParser(TokenStream input, RythmMLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Song";	
   	}
   	
   	@Override
   	protected RythmMLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSong
entryRuleSong returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSongRule()); }
	 iv_ruleSong=ruleSong 
	 { $current=$iv_ruleSong.current; } 
	 EOF 
;

// Rule Song
ruleSong returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Song' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSongAccess().getSongKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSongAccess().getLeftCurlyBracketKeyword_1());
    }
	otherlv_2='tracks' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSongAccess().getTracksKeyword_2());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSongAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSongAccess().getTracksTrackParserRuleCall_4_0()); 
	    }
		lv_tracks_4_0=ruleTrack		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSongRule());
	        }
       		add(
       			$current, 
       			"tracks",
        		lv_tracks_4_0, 
        		"org.xtext.example.rythmML.RythmML.Track");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSongAccess().getCommaKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSongAccess().getTracksTrackParserRuleCall_5_1_0()); 
	    }
		lv_tracks_6_0=ruleTrack		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSongRule());
	        }
       		add(
       			$current, 
       			"tracks",
        		lv_tracks_6_0, 
        		"org.xtext.example.rythmML.RythmML.Track");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getSongAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getSongAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleTrack
entryRuleTrack returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTrackRule()); }
	 iv_ruleTrack=ruleTrack 
	 { $current=$iv_ruleTrack.current; } 
	 EOF 
;

// Rule Track
ruleTrack returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Track' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTrackAccess().getTrackKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_1());
    }
	otherlv_2='sequences' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTrackAccess().getSequencesKeyword_2());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTrackAccess().getSequencesSequenceParserRuleCall_4_0()); 
	    }
		lv_sequences_4_0=ruleSequence		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTrackRule());
	        }
       		add(
       			$current, 
       			"sequences",
        		lv_sequences_4_0, 
        		"org.xtext.example.rythmML.RythmML.Sequence");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTrackAccess().getCommaKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTrackAccess().getSequencesSequenceParserRuleCall_5_1_0()); 
	    }
		lv_sequences_6_0=ruleSequence		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTrackRule());
	        }
       		add(
       			$current, 
       			"sequences",
        		lv_sequences_6_0, 
        		"org.xtext.example.rythmML.RythmML.Sequence");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleSequence
entryRuleSequence returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSequenceRule()); }
	 iv_ruleSequence=ruleSequence 
	 { $current=$iv_ruleSequence.current; } 
	 EOF 
;

// Rule Sequence
ruleSequence returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Sequence' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_1());
    }
	otherlv_2='bars' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSequenceAccess().getBarsKeyword_2());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSequenceAccess().getBarsBarParserRuleCall_4_0()); 
	    }
		lv_bars_4_0=ruleBar		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSequenceRule());
	        }
       		add(
       			$current, 
       			"bars",
        		lv_bars_4_0, 
        		"org.xtext.example.rythmML.RythmML.Bar");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSequenceAccess().getCommaKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSequenceAccess().getBarsBarParserRuleCall_5_1_0()); 
	    }
		lv_bars_6_0=ruleBar		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSequenceRule());
	        }
       		add(
       			$current, 
       			"bars",
        		lv_bars_6_0, 
        		"org.xtext.example.rythmML.RythmML.Bar");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleBar
entryRuleBar returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBarRule()); }
	 iv_ruleBar=ruleBar 
	 { $current=$iv_ruleBar.current; } 
	 EOF 
;

// Rule Bar
ruleBar returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Bar' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBarAccess().getBarKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getBarAccess().getLeftCurlyBracketKeyword_1());
    }
	otherlv_2='beats' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBarAccess().getBeatsKeyword_2());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBarAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBarAccess().getBeatsBeatParserRuleCall_4_0()); 
	    }
		lv_beats_4_0=ruleBeat		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBarRule());
	        }
       		add(
       			$current, 
       			"beats",
        		lv_beats_4_0, 
        		"org.xtext.example.rythmML.RythmML.Beat");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getBarAccess().getCommaKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBarAccess().getBeatsBeatParserRuleCall_5_1_0()); 
	    }
		lv_beats_6_0=ruleBeat		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBarRule());
	        }
       		add(
       			$current, 
       			"beats",
        		lv_beats_6_0, 
        		"org.xtext.example.rythmML.RythmML.Beat");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getBarAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getBarAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleBeat
entryRuleBeat returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBeatRule()); }
	 iv_ruleBeat=ruleBeat 
	 { $current=$iv_ruleBeat.current; } 
	 EOF 
;

// Rule Beat
ruleBeat returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Beat' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBeatAccess().getBeatKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getBeatAccess().getLeftCurlyBracketKeyword_1());
    }
	otherlv_2='ticks' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBeatAccess().getTicksKeyword_2());
    }
	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBeatAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBeatAccess().getTicksTickParserRuleCall_4_0()); 
	    }
		lv_ticks_4_0=ruleTick		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBeatRule());
	        }
       		add(
       			$current, 
       			"ticks",
        		lv_ticks_4_0, 
        		"org.xtext.example.rythmML.RythmML.Tick");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getBeatAccess().getCommaKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBeatAccess().getTicksTickParserRuleCall_5_1_0()); 
	    }
		lv_ticks_6_0=ruleTick		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBeatRule());
	        }
       		add(
       			$current, 
       			"ticks",
        		lv_ticks_6_0, 
        		"org.xtext.example.rythmML.RythmML.Tick");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getBeatAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getBeatAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleTick
entryRuleTick returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTickRule()); }
	 iv_ruleTick=ruleTick 
	 { $current=$iv_ruleTick.current; } 
	 EOF 
;

// Rule Tick
ruleTick returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getTickAccess().getTickAction_0(),
            $current);
    }
)	otherlv_1='Tick' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTickAccess().getTickKeyword_1());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


