import groovy.lang.GroovyObject;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;

import java.io.IOException;

/**
 *
 *
 * @ClassName    : 	Test
 * @Description : 	TODO
 * @author        :	xing.chen
 * @date        :	2019/5/6
 *
 */

public class Test {
    public static void main(String[] ages){
        System.out.println("3333");
        String[] roots = new String[] { "src/main/java/" };
        //通过指定的roots来初始化GroovyScriptEngine

        try {
            GroovyScriptEngine gse = new GroovyScriptEngine(roots);
            GroovyObject groovyObject = (GroovyObject) gse.loadScriptByName("src/main/java/TestScript.groovy").newInstance();
            GroovyTest gt  = (GroovyTest) gse.loadScriptByName("src/main/java/TestScript.groovy").newInstance();
            System.out.println( gt.output("5555"));
            String result = (String) groovyObject.invokeMethod("output", "hello");
            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ResourceException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ScriptException e) {
            e.printStackTrace();
        }

    }
}