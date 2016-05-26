import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class StringCalc2
{
    public StringCalc2()
    {
   
    }
    
    public String operations(String expression) throws Exception{
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = expression;
        return engine.eval(foo).toString();        
    }
}
