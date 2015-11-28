1. If you want to make "alias grun='java org.antlr.v4.gui.TestRig'" work, you should run: export CLASSPATH=".:/usr/local/lib/antlr-4.5.1-complete.jar:$CLASSPATH", first. Because you will need the jar file to be included in your class path. Otherwise you will encounter the error: Error: Could not find or load main class org.antlr.v4.gui.TestRig

2. 
