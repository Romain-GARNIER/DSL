/**
 * generated by Xtext
 */
package arduinoML.concretesyntax.formatting;

import arduinoML.concretesyntax.services.ArduinoMLGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormatter} as an example
 */
@SuppressWarnings("all")
public class ArduinoMLFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private ArduinoMLGrammarAccess _arduinoMLGrammarAccess;
  
  @Override
  protected void configureFormatting(final FormattingConfig c) {
    List<Pair<Keyword, Keyword>> _findKeywordPairs = this._arduinoMLGrammarAccess.findKeywordPairs("{", "}");
    for (final Pair<Keyword, Keyword> pair : _findKeywordPairs) {
      {
        c.setIndentation(pair.getFirst(), pair.getSecond());
        c.setLinewrap(1).after(pair.getFirst());
        c.setLinewrap(1).before(pair.getSecond());
        c.setLinewrap(1).after(pair.getSecond());
      }
    }
    List<Keyword> _findKeywords = this._arduinoMLGrammarAccess.findKeywords(",");
    for (final Keyword comma : _findKeywords) {
      {
        c.setNoLinewrap().before(comma);
        c.setNoSpace().before(comma);
        c.setLinewrap().after(comma);
      }
    }
    c.setLinewrap(0, 1, 2).before(this._arduinoMLGrammarAccess.getSL_COMMENTRule());
    c.setLinewrap(0, 1, 2).before(this._arduinoMLGrammarAccess.getML_COMMENTRule());
    c.setLinewrap(0, 1, 1).after(this._arduinoMLGrammarAccess.getML_COMMENTRule());
  }
}
