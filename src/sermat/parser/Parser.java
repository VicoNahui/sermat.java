
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Sep 30 01:01:11 UYT 2015
//----------------------------------------------------

package sermat.parser;

import java.io.*;
import java.util.*;
import java_cup.runtime.Symbol;
import java.lang.String;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Sep 30 01:01:11 UYT 2015
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\022\000\002\002\004\000\002\004\004\000\002\004" +
    "\005\000\002\004\004\000\002\004\005\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\004\005\000\002\004\003\000\002" +
    "\002\007\000\002\002\007\000\002\002\005\000\002\002" +
    "\005\000\002\003\003\000\002\003\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\022\010\014\012\010\015\004\016\012\017" +
    "\006\020\011\021\007\022\005\001\002\000\012\002\ufffa" +
    "\004\ufffa\011\ufffa\013\ufffa\001\002\000\012\002\ufff8\004" +
    "\ufff8\011\ufff8\013\ufff8\001\002\000\012\002\ufffc\004\ufffc" +
    "\011\ufffc\013\ufffc\001\002\000\012\002\ufff9\004\ufff9\011" +
    "\ufff9\013\ufff9\001\002\000\024\010\014\012\010\013\041" +
    "\015\004\016\012\017\006\020\011\021\007\022\005\001" +
    "\002\000\012\002\ufffb\004\ufffb\011\ufffb\013\ufffb\001\002" +
    "\000\014\002\ufff6\004\ufff6\011\ufff6\013\ufff6\014\036\001" +
    "\002\000\004\002\035\001\002\000\010\011\017\016\015" +
    "\022\020\001\002\000\004\007\033\001\002\000\006\004" +
    "\023\011\024\001\002\000\012\002\000\004\000\011\000" +
    "\013\000\001\002\000\004\007\021\001\002\000\022\010" +
    "\014\012\010\015\004\016\012\017\006\020\011\021\007" +
    "\022\005\001\002\000\006\004\ufff3\011\ufff3\001\002\000" +
    "\006\016\025\022\026\001\002\000\012\002\uffff\004\uffff" +
    "\011\uffff\013\uffff\001\002\000\004\007\031\001\002\000" +
    "\004\007\027\001\002\000\022\010\014\012\010\015\004" +
    "\016\012\017\006\020\011\021\007\022\005\001\002\000" +
    "\006\004\ufff5\011\ufff5\001\002\000\022\010\014\012\010" +
    "\015\004\016\012\017\006\020\011\021\007\022\005\001" +
    "\002\000\006\004\ufff4\011\ufff4\001\002\000\022\010\014" +
    "\012\010\015\004\016\012\017\006\020\011\021\007\022" +
    "\005\001\002\000\006\004\ufff2\011\ufff2\001\002\000\004" +
    "\002\001\001\002\000\022\010\014\012\010\015\004\016" +
    "\012\017\006\020\011\021\007\022\005\001\002\000\012" +
    "\002\ufff7\004\ufff7\011\ufff7\013\ufff7\001\002\000\006\004" +
    "\043\013\044\001\002\000\012\002\ufffe\004\ufffe\011\ufffe" +
    "\013\ufffe\001\002\000\006\004\ufff1\013\ufff1\001\002\000" +
    "\022\010\014\012\010\015\004\016\012\017\006\020\011" +
    "\021\007\022\005\001\002\000\012\002\ufffd\004\ufffd\011" +
    "\ufffd\013\ufffd\001\002\000\006\004\ufff0\013\ufff0\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\004\004\012\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\037\004\041\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\002\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\021\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\027\001\001\000\002\001\001\000\004" +
    "\004\031\001\001\000\002\001\001\000\004\004\033\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\036" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\044\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	private final Map<String, Object> bindings = new HashMap<String, Object>();
		
	public void setBinding(String id, Object obj){
		if(id.charAt(0) != '$'){
			throw new Error("Invalid binding identifier" + "'id'");
		}
		if(bindings.containsKey(id)){
			throw new Error("'"+ id +"'" +  "is already bound"); 
		}
		bindings.put(id, obj);
	}
	
	public Object getBinding(String id){
		if(bindings.containsKey(id)){
			return bindings.get(id);
		}
		
		throw new Error("'"+ id +"'" + "is not bound");		
	}
	
	public void syntax_error(Symbol currentToken) {
		report_error("Syntax error at [" + (currentToken.left+1) +"," + (currentToken.right+1) +"]!", null);
	}

	public static Symbol parse(Reader input) throws Exception {
		return (new Parser(new Lexer(input))).parse();
	}

	public static Symbol parse(String input) throws Exception {
		return parse(new StringReader(input));
	}

	public static void main(String[] args) throws Exception {
		if (args.length < 1) {
			System.out.println(parse(new InputStreamReader(System.in, "UTF8")).value);
		} else for (int i = 0; i < args.length; ++i) {
			System.out.println(parse(new InputStreamReader(new FileInputStream(args[i]), "UTF8")).value);
		}
	}


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // elements ::= elements COMMA value 
            {
              List<Object> RESULT =null;
		int $0left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $0right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		List<Object> $0 = (List<Object>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = $0; RESULT.add($1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("elements",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // elements ::= value 
            {
              List<Object> RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new ArrayList<Object>(); RESULT.add($1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("elements",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // members ::= ID COLON value 
            {
              Map<String,Object> RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String $1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new HashMap<String, Object>(); RESULT.put($1, $2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("members",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // members ::= STR COLON value 
            {
              Map<String,Object> RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String $1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new HashMap<String, Object>(); RESULT.put($1, $2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("members",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // members ::= members COMMA ID COLON value 
            {
              Map<String,Object> RESULT =null;
		int $0left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int $0right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Map<String,Object> $0 = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String $1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = $0; RESULT.put($1, $2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("members",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // members ::= members COMMA STR COLON value 
            {
              Map<String,Object> RESULT =null;
		int $0left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int $0right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Map<String,Object> $0 = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String $1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = $0; RESULT.put($1, $2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("members",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // value ::= ID 
            {
              Object RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String $1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = parser.getBinding($1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // value ::= ID EQUALS value 
            {
              Object RESULT =null;
		int $0left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int $0right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String $0 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 parser.setBinding($0, $1); RESULT = $1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // value ::= STR 
            {
              Object RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String $1 = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = $1.substring(1,$1.length()-1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // value ::= NULL 
            {
              Object RESULT =null;
		 RESULT = null; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // value ::= NUM 
            {
              Object RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object $1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = Double.valueOf((String)$1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // value ::= FALSE 
            {
              Object RESULT =null;
		 RESULT = false; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // value ::= TRUE 
            {
              Object RESULT =null;
		 RESULT = true; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // value ::= LEFT_BRACK elements RIGHT_BRACK 
            {
              Object RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		List<Object> $1 = (List<Object>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = $1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // value ::= LEFT_BRACK RIGHT_BRACK 
            {
              Object RESULT =null;
		 RESULT = new ArrayList<Object>(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // value ::= LEFT_BRACE members RIGHT_BRACE 
            {
              Object RESULT =null;
		int $1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int $1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Map<String,Object> $1 = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = $1; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // value ::= LEFT_BRACE RIGHT_BRACE 
            {
              Object RESULT =null;
		 RESULT = new HashMap<String,Object>(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= value EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

