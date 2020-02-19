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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRythmMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Song'", "'{'", "'tracks'", "','", "'}'", "'Track'", "'sequences'", "'Sequence'", "'bars'", "'Bar'", "'beats'", "'Beat'", "'ticks'", "'Tick'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRythmMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRythmMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRythmMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRythmML.g"; }



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



    // $ANTLR start "entryRuleSong"
    // InternalRythmML.g:67:1: entryRuleSong returns [EObject current=null] : iv_ruleSong= ruleSong EOF ;
    public final EObject entryRuleSong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSong = null;


        try {
            // InternalRythmML.g:68:2: (iv_ruleSong= ruleSong EOF )
            // InternalRythmML.g:69:2: iv_ruleSong= ruleSong EOF
            {
             newCompositeNode(grammarAccess.getSongRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSong=ruleSong();

            state._fsp--;

             current =iv_ruleSong; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSong"


    // $ANTLR start "ruleSong"
    // InternalRythmML.g:76:1: ruleSong returns [EObject current=null] : (otherlv_0= 'Song' otherlv_1= '{' otherlv_2= 'tracks' otherlv_3= '{' ( (lv_tracks_4_0= ruleTrack ) ) (otherlv_5= ',' ( (lv_tracks_6_0= ruleTrack ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleSong() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_tracks_4_0 = null;

        EObject lv_tracks_6_0 = null;


         enterRule(); 
            
        try {
            // InternalRythmML.g:79:28: ( (otherlv_0= 'Song' otherlv_1= '{' otherlv_2= 'tracks' otherlv_3= '{' ( (lv_tracks_4_0= ruleTrack ) ) (otherlv_5= ',' ( (lv_tracks_6_0= ruleTrack ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRythmML.g:80:1: (otherlv_0= 'Song' otherlv_1= '{' otherlv_2= 'tracks' otherlv_3= '{' ( (lv_tracks_4_0= ruleTrack ) ) (otherlv_5= ',' ( (lv_tracks_6_0= ruleTrack ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRythmML.g:80:1: (otherlv_0= 'Song' otherlv_1= '{' otherlv_2= 'tracks' otherlv_3= '{' ( (lv_tracks_4_0= ruleTrack ) ) (otherlv_5= ',' ( (lv_tracks_6_0= ruleTrack ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRythmML.g:80:3: otherlv_0= 'Song' otherlv_1= '{' otherlv_2= 'tracks' otherlv_3= '{' ( (lv_tracks_4_0= ruleTrack ) ) (otherlv_5= ',' ( (lv_tracks_6_0= ruleTrack ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSongAccess().getSongKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getSongAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getSongAccess().getTracksKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getSongAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalRythmML.g:96:1: ( (lv_tracks_4_0= ruleTrack ) )
            // InternalRythmML.g:97:1: (lv_tracks_4_0= ruleTrack )
            {
            // InternalRythmML.g:97:1: (lv_tracks_4_0= ruleTrack )
            // InternalRythmML.g:98:3: lv_tracks_4_0= ruleTrack
            {
             
            	        newCompositeNode(grammarAccess.getSongAccess().getTracksTrackParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            lv_tracks_4_0=ruleTrack();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSongRule());
            	        }
                   		add(
                   			current, 
                   			"tracks",
                    		lv_tracks_4_0, 
                    		"org.xtext.example.rythmML.RythmML.Track");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRythmML.g:114:2: (otherlv_5= ',' ( (lv_tracks_6_0= ruleTrack ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRythmML.g:114:4: otherlv_5= ',' ( (lv_tracks_6_0= ruleTrack ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_5); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSongAccess().getCommaKeyword_5_0());
            	        
            	    // InternalRythmML.g:118:1: ( (lv_tracks_6_0= ruleTrack ) )
            	    // InternalRythmML.g:119:1: (lv_tracks_6_0= ruleTrack )
            	    {
            	    // InternalRythmML.g:119:1: (lv_tracks_6_0= ruleTrack )
            	    // InternalRythmML.g:120:3: lv_tracks_6_0= ruleTrack
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSongAccess().getTracksTrackParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_tracks_6_0=ruleTrack();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSongRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tracks",
            	            		lv_tracks_6_0, 
            	            		"org.xtext.example.rythmML.RythmML.Track");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_7, grammarAccess.getSongAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getSongAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSong"


    // $ANTLR start "entryRuleTrack"
    // InternalRythmML.g:152:1: entryRuleTrack returns [EObject current=null] : iv_ruleTrack= ruleTrack EOF ;
    public final EObject entryRuleTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrack = null;


        try {
            // InternalRythmML.g:153:2: (iv_ruleTrack= ruleTrack EOF )
            // InternalRythmML.g:154:2: iv_ruleTrack= ruleTrack EOF
            {
             newCompositeNode(grammarAccess.getTrackRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTrack=ruleTrack();

            state._fsp--;

             current =iv_ruleTrack; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrack"


    // $ANTLR start "ruleTrack"
    // InternalRythmML.g:161:1: ruleTrack returns [EObject current=null] : (otherlv_0= 'Track' otherlv_1= '{' otherlv_2= 'sequences' otherlv_3= '{' ( (lv_sequences_4_0= ruleSequence ) ) (otherlv_5= ',' ( (lv_sequences_6_0= ruleSequence ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_sequences_4_0 = null;

        EObject lv_sequences_6_0 = null;


         enterRule(); 
            
        try {
            // InternalRythmML.g:164:28: ( (otherlv_0= 'Track' otherlv_1= '{' otherlv_2= 'sequences' otherlv_3= '{' ( (lv_sequences_4_0= ruleSequence ) ) (otherlv_5= ',' ( (lv_sequences_6_0= ruleSequence ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRythmML.g:165:1: (otherlv_0= 'Track' otherlv_1= '{' otherlv_2= 'sequences' otherlv_3= '{' ( (lv_sequences_4_0= ruleSequence ) ) (otherlv_5= ',' ( (lv_sequences_6_0= ruleSequence ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRythmML.g:165:1: (otherlv_0= 'Track' otherlv_1= '{' otherlv_2= 'sequences' otherlv_3= '{' ( (lv_sequences_4_0= ruleSequence ) ) (otherlv_5= ',' ( (lv_sequences_6_0= ruleSequence ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRythmML.g:165:3: otherlv_0= 'Track' otherlv_1= '{' otherlv_2= 'sequences' otherlv_3= '{' ( (lv_sequences_4_0= ruleSequence ) ) (otherlv_5= ',' ( (lv_sequences_6_0= ruleSequence ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getTrackAccess().getTrackKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_1, grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getTrackAccess().getSequencesKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_9); 

                	newLeafNode(otherlv_3, grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalRythmML.g:181:1: ( (lv_sequences_4_0= ruleSequence ) )
            // InternalRythmML.g:182:1: (lv_sequences_4_0= ruleSequence )
            {
            // InternalRythmML.g:182:1: (lv_sequences_4_0= ruleSequence )
            // InternalRythmML.g:183:3: lv_sequences_4_0= ruleSequence
            {
             
            	        newCompositeNode(grammarAccess.getTrackAccess().getSequencesSequenceParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            lv_sequences_4_0=ruleSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTrackRule());
            	        }
                   		add(
                   			current, 
                   			"sequences",
                    		lv_sequences_4_0, 
                    		"org.xtext.example.rythmML.RythmML.Sequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRythmML.g:199:2: (otherlv_5= ',' ( (lv_sequences_6_0= ruleSequence ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRythmML.g:199:4: otherlv_5= ',' ( (lv_sequences_6_0= ruleSequence ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_9); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTrackAccess().getCommaKeyword_5_0());
            	        
            	    // InternalRythmML.g:203:1: ( (lv_sequences_6_0= ruleSequence ) )
            	    // InternalRythmML.g:204:1: (lv_sequences_6_0= ruleSequence )
            	    {
            	    // InternalRythmML.g:204:1: (lv_sequences_6_0= ruleSequence )
            	    // InternalRythmML.g:205:3: lv_sequences_6_0= ruleSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTrackAccess().getSequencesSequenceParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_sequences_6_0=ruleSequence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTrackRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sequences",
            	            		lv_sequences_6_0, 
            	            		"org.xtext.example.rythmML.RythmML.Sequence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_7, grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrack"


    // $ANTLR start "entryRuleSequence"
    // InternalRythmML.g:237:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalRythmML.g:238:2: (iv_ruleSequence= ruleSequence EOF )
            // InternalRythmML.g:239:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalRythmML.g:246:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'Sequence' otherlv_1= '{' otherlv_2= 'bars' otherlv_3= '{' ( (lv_bars_4_0= ruleBar ) ) (otherlv_5= ',' ( (lv_bars_6_0= ruleBar ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_bars_4_0 = null;

        EObject lv_bars_6_0 = null;


         enterRule(); 
            
        try {
            // InternalRythmML.g:249:28: ( (otherlv_0= 'Sequence' otherlv_1= '{' otherlv_2= 'bars' otherlv_3= '{' ( (lv_bars_4_0= ruleBar ) ) (otherlv_5= ',' ( (lv_bars_6_0= ruleBar ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRythmML.g:250:1: (otherlv_0= 'Sequence' otherlv_1= '{' otherlv_2= 'bars' otherlv_3= '{' ( (lv_bars_4_0= ruleBar ) ) (otherlv_5= ',' ( (lv_bars_6_0= ruleBar ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRythmML.g:250:1: (otherlv_0= 'Sequence' otherlv_1= '{' otherlv_2= 'bars' otherlv_3= '{' ( (lv_bars_4_0= ruleBar ) ) (otherlv_5= ',' ( (lv_bars_6_0= ruleBar ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRythmML.g:250:3: otherlv_0= 'Sequence' otherlv_1= '{' otherlv_2= 'bars' otherlv_3= '{' ( (lv_bars_4_0= ruleBar ) ) (otherlv_5= ',' ( (lv_bars_6_0= ruleBar ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getSequenceAccess().getBarsKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_11); 

                	newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalRythmML.g:266:1: ( (lv_bars_4_0= ruleBar ) )
            // InternalRythmML.g:267:1: (lv_bars_4_0= ruleBar )
            {
            // InternalRythmML.g:267:1: (lv_bars_4_0= ruleBar )
            // InternalRythmML.g:268:3: lv_bars_4_0= ruleBar
            {
             
            	        newCompositeNode(grammarAccess.getSequenceAccess().getBarsBarParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bars_4_0=ruleBar();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	        }
                   		add(
                   			current, 
                   			"bars",
                    		lv_bars_4_0, 
                    		"org.xtext.example.rythmML.RythmML.Bar");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRythmML.g:284:2: (otherlv_5= ',' ( (lv_bars_6_0= ruleBar ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRythmML.g:284:4: otherlv_5= ',' ( (lv_bars_6_0= ruleBar ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_11); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSequenceAccess().getCommaKeyword_5_0());
            	        
            	    // InternalRythmML.g:288:1: ( (lv_bars_6_0= ruleBar ) )
            	    // InternalRythmML.g:289:1: (lv_bars_6_0= ruleBar )
            	    {
            	    // InternalRythmML.g:289:1: (lv_bars_6_0= ruleBar )
            	    // InternalRythmML.g:290:3: lv_bars_6_0= ruleBar
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequenceAccess().getBarsBarParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_bars_6_0=ruleBar();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bars",
            	            		lv_bars_6_0, 
            	            		"org.xtext.example.rythmML.RythmML.Bar");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_7, grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleBar"
    // InternalRythmML.g:322:1: entryRuleBar returns [EObject current=null] : iv_ruleBar= ruleBar EOF ;
    public final EObject entryRuleBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBar = null;


        try {
            // InternalRythmML.g:323:2: (iv_ruleBar= ruleBar EOF )
            // InternalRythmML.g:324:2: iv_ruleBar= ruleBar EOF
            {
             newCompositeNode(grammarAccess.getBarRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBar=ruleBar();

            state._fsp--;

             current =iv_ruleBar; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBar"


    // $ANTLR start "ruleBar"
    // InternalRythmML.g:331:1: ruleBar returns [EObject current=null] : (otherlv_0= 'Bar' otherlv_1= '{' otherlv_2= 'beats' otherlv_3= '{' ( (lv_beats_4_0= ruleBeat ) ) (otherlv_5= ',' ( (lv_beats_6_0= ruleBeat ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleBar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_beats_4_0 = null;

        EObject lv_beats_6_0 = null;


         enterRule(); 
            
        try {
            // InternalRythmML.g:334:28: ( (otherlv_0= 'Bar' otherlv_1= '{' otherlv_2= 'beats' otherlv_3= '{' ( (lv_beats_4_0= ruleBeat ) ) (otherlv_5= ',' ( (lv_beats_6_0= ruleBeat ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRythmML.g:335:1: (otherlv_0= 'Bar' otherlv_1= '{' otherlv_2= 'beats' otherlv_3= '{' ( (lv_beats_4_0= ruleBeat ) ) (otherlv_5= ',' ( (lv_beats_6_0= ruleBeat ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRythmML.g:335:1: (otherlv_0= 'Bar' otherlv_1= '{' otherlv_2= 'beats' otherlv_3= '{' ( (lv_beats_4_0= ruleBeat ) ) (otherlv_5= ',' ( (lv_beats_6_0= ruleBeat ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRythmML.g:335:3: otherlv_0= 'Bar' otherlv_1= '{' otherlv_2= 'beats' otherlv_3= '{' ( (lv_beats_4_0= ruleBeat ) ) (otherlv_5= ',' ( (lv_beats_6_0= ruleBeat ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getBarAccess().getBarKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12); 

                	newLeafNode(otherlv_1, grammarAccess.getBarAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getBarAccess().getBeatsKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_13); 

                	newLeafNode(otherlv_3, grammarAccess.getBarAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalRythmML.g:351:1: ( (lv_beats_4_0= ruleBeat ) )
            // InternalRythmML.g:352:1: (lv_beats_4_0= ruleBeat )
            {
            // InternalRythmML.g:352:1: (lv_beats_4_0= ruleBeat )
            // InternalRythmML.g:353:3: lv_beats_4_0= ruleBeat
            {
             
            	        newCompositeNode(grammarAccess.getBarAccess().getBeatsBeatParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            lv_beats_4_0=ruleBeat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBarRule());
            	        }
                   		add(
                   			current, 
                   			"beats",
                    		lv_beats_4_0, 
                    		"org.xtext.example.rythmML.RythmML.Beat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRythmML.g:369:2: (otherlv_5= ',' ( (lv_beats_6_0= ruleBeat ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRythmML.g:369:4: otherlv_5= ',' ( (lv_beats_6_0= ruleBeat ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_13); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBarAccess().getCommaKeyword_5_0());
            	        
            	    // InternalRythmML.g:373:1: ( (lv_beats_6_0= ruleBeat ) )
            	    // InternalRythmML.g:374:1: (lv_beats_6_0= ruleBeat )
            	    {
            	    // InternalRythmML.g:374:1: (lv_beats_6_0= ruleBeat )
            	    // InternalRythmML.g:375:3: lv_beats_6_0= ruleBeat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBarAccess().getBeatsBeatParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_beats_6_0=ruleBeat();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBarRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"beats",
            	            		lv_beats_6_0, 
            	            		"org.xtext.example.rythmML.RythmML.Beat");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_7, grammarAccess.getBarAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getBarAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBar"


    // $ANTLR start "entryRuleBeat"
    // InternalRythmML.g:407:1: entryRuleBeat returns [EObject current=null] : iv_ruleBeat= ruleBeat EOF ;
    public final EObject entryRuleBeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeat = null;


        try {
            // InternalRythmML.g:408:2: (iv_ruleBeat= ruleBeat EOF )
            // InternalRythmML.g:409:2: iv_ruleBeat= ruleBeat EOF
            {
             newCompositeNode(grammarAccess.getBeatRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBeat=ruleBeat();

            state._fsp--;

             current =iv_ruleBeat; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBeat"


    // $ANTLR start "ruleBeat"
    // InternalRythmML.g:416:1: ruleBeat returns [EObject current=null] : (otherlv_0= 'Beat' otherlv_1= '{' otherlv_2= 'ticks' otherlv_3= '{' ( (lv_ticks_4_0= ruleTick ) ) (otherlv_5= ',' ( (lv_ticks_6_0= ruleTick ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleBeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_ticks_4_0 = null;

        EObject lv_ticks_6_0 = null;


         enterRule(); 
            
        try {
            // InternalRythmML.g:419:28: ( (otherlv_0= 'Beat' otherlv_1= '{' otherlv_2= 'ticks' otherlv_3= '{' ( (lv_ticks_4_0= ruleTick ) ) (otherlv_5= ',' ( (lv_ticks_6_0= ruleTick ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalRythmML.g:420:1: (otherlv_0= 'Beat' otherlv_1= '{' otherlv_2= 'ticks' otherlv_3= '{' ( (lv_ticks_4_0= ruleTick ) ) (otherlv_5= ',' ( (lv_ticks_6_0= ruleTick ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalRythmML.g:420:1: (otherlv_0= 'Beat' otherlv_1= '{' otherlv_2= 'ticks' otherlv_3= '{' ( (lv_ticks_4_0= ruleTick ) ) (otherlv_5= ',' ( (lv_ticks_6_0= ruleTick ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalRythmML.g:420:3: otherlv_0= 'Beat' otherlv_1= '{' otherlv_2= 'ticks' otherlv_3= '{' ( (lv_ticks_4_0= ruleTick ) ) (otherlv_5= ',' ( (lv_ticks_6_0= ruleTick ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getBeatAccess().getBeatKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_14); 

                	newLeafNode(otherlv_1, grammarAccess.getBeatAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getBeatAccess().getTicksKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_3, grammarAccess.getBeatAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalRythmML.g:436:1: ( (lv_ticks_4_0= ruleTick ) )
            // InternalRythmML.g:437:1: (lv_ticks_4_0= ruleTick )
            {
            // InternalRythmML.g:437:1: (lv_ticks_4_0= ruleTick )
            // InternalRythmML.g:438:3: lv_ticks_4_0= ruleTick
            {
             
            	        newCompositeNode(grammarAccess.getBeatAccess().getTicksTickParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ticks_4_0=ruleTick();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBeatRule());
            	        }
                   		add(
                   			current, 
                   			"ticks",
                    		lv_ticks_4_0, 
                    		"org.xtext.example.rythmML.RythmML.Tick");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalRythmML.g:454:2: (otherlv_5= ',' ( (lv_ticks_6_0= ruleTick ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRythmML.g:454:4: otherlv_5= ',' ( (lv_ticks_6_0= ruleTick ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBeatAccess().getCommaKeyword_5_0());
            	        
            	    // InternalRythmML.g:458:1: ( (lv_ticks_6_0= ruleTick ) )
            	    // InternalRythmML.g:459:1: (lv_ticks_6_0= ruleTick )
            	    {
            	    // InternalRythmML.g:459:1: (lv_ticks_6_0= ruleTick )
            	    // InternalRythmML.g:460:3: lv_ticks_6_0= ruleTick
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBeatAccess().getTicksTickParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_ticks_6_0=ruleTick();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBeatRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ticks",
            	            		lv_ticks_6_0, 
            	            		"org.xtext.example.rythmML.RythmML.Tick");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_7, grammarAccess.getBeatAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getBeatAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBeat"


    // $ANTLR start "entryRuleTick"
    // InternalRythmML.g:492:1: entryRuleTick returns [EObject current=null] : iv_ruleTick= ruleTick EOF ;
    public final EObject entryRuleTick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTick = null;


        try {
            // InternalRythmML.g:493:2: (iv_ruleTick= ruleTick EOF )
            // InternalRythmML.g:494:2: iv_ruleTick= ruleTick EOF
            {
             newCompositeNode(grammarAccess.getTickRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTick=ruleTick();

            state._fsp--;

             current =iv_ruleTick; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTick"


    // $ANTLR start "ruleTick"
    // InternalRythmML.g:501:1: ruleTick returns [EObject current=null] : ( () otherlv_1= 'Tick' ) ;
    public final EObject ruleTick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalRythmML.g:504:28: ( ( () otherlv_1= 'Tick' ) )
            // InternalRythmML.g:505:1: ( () otherlv_1= 'Tick' )
            {
            // InternalRythmML.g:505:1: ( () otherlv_1= 'Tick' )
            // InternalRythmML.g:505:2: () otherlv_1= 'Tick'
            {
            // InternalRythmML.g:505:2: ()
            // InternalRythmML.g:506:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTickAccess().getTickAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_1, grammarAccess.getTickAccess().getTickKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTick"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    }


}