/*
 * generated by Xtext 2.21.0
 */
package org.example.ehealthmanagement.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.example.ehealthmanagement.xtext.parser.antlr.internal.InternalEHealthManagementParser;
import org.example.ehealthmanagement.xtext.services.EHealthManagementGrammarAccess;

public class EHealthManagementParser extends AbstractAntlrParser {

	@Inject
	private EHealthManagementGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEHealthManagementParser createParser(XtextTokenStream stream) {
		return new InternalEHealthManagementParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "User";
	}

	public EHealthManagementGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EHealthManagementGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
