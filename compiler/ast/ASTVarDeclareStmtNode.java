package compiler.ast;

import compiler.Symbol;
import compiler.SymbolTableIntf;
import java.io.OutputStreamWriter;

public class ASTVarDeclareStmtNode extends ASTStmtNode {

    Symbol symbol;

    public ASTVarDeclareStmtNode(Symbol symbol) {
        this.symbol = symbol;
    }

    @Override
    public void print(OutputStreamWriter outStream, String indent) throws Exception {
        outStream.write(indent + "DECLARE" + this.symbol.m_name);
        outStream.write("\n");
    }

    @Override
    public void execute() {
    }
}
