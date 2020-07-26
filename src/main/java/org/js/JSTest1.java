package org.js;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.Scriptable;

public class JSTest1 {
	public static void main(String[] args) {
		StringBuffer script = new StringBuffer();
		script.append("importPackage(java.awt);\n");
		script.append("var frame = new Frame(\"JavaScript\");\n");
		script.append("frame.show();\n");
		script.append("frame.setSize(new Dimension(200,1000));\n");
		script.append("var button = new Button(\"aaaa\");\n");
		script.append("frame.add(button);\n");
		script.append("frame.show();\n");

		Context ctx = Context.enter();
		Scriptable scope = new ImporterTopLevel(ctx);
		try {
			ctx.evaluateString(scope, script.toString(), null, 1, null);
		} finally {
			Context.exit();
		}
	}
}
