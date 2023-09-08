// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: MicroPython.jflex


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class MicroPythonLexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300"+
    "\1\u2400\2\u1f00\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\10\u2f00\31\u1f00\1\u0100\1\u3000\1\u3100\1\u0100\1\u3200"+
    "\1\u3300\1\u3400\1\u3500\1\u1f00\1\u3600\1\u3700\1\u3800\1\u3900"+
    "\1\u0100\1\u3a00\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000"+
    "\1\u1f00\1\u4100\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700"+
    "\1\u4800\1\u4900\1\u4a00\1\u4b00\1\u4c00\1\u1f00\1\u4d00\1\u4e00"+
    "\1\u4f00\1\u1f00\3\u0100\1\u5000\1\u5100\1\u5200\12\u1f00\4\u0100"+
    "\1\u5300\17\u1f00\2\u0100\1\u5400\41\u1f00\2\u0100\1\u5500\1\u5600"+
    "\2\u1f00\1\u5700\1\u5800\27\u0100\1\u5900\2\u0100\1\u5a00\45\u1f00"+
    "\1\u0100\1\u5b00\1\u5c00\11\u1f00\1\u5d00\27\u1f00\1\u5e00\1\u5f00"+
    "\1\u6000\1\u6100\11\u1f00\1\u6200\1\u6300\5\u1f00\1\u6400\1\u6500"+
    "\4\u1f00\1\u6600\21\u1f00\246\u0100\1\u6700\20\u0100\1\u6800\1\u6900"+
    "\25\u0100\1\u6a00\34\u0100\1\u6b00\14\u1f00\2\u0100\1\u6c00\u0e05\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\3\3\22\0\1\1\1\4\1\0"+
    "\1\5\4\0\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\12\16\1\17\1\20\1\21\1\22\1\23"+
    "\2\0\2\24\1\25\10\24\1\26\1\27\2\24\1\30"+
    "\12\24\4\0\1\31\1\0\1\32\1\24\1\33\1\34"+
    "\1\35\1\36\1\24\1\37\1\40\2\24\1\41\1\42"+
    "\1\43\1\44\1\45\1\24\1\46\1\47\1\50\1\51"+
    "\1\24\1\52\1\24\1\53\1\24\12\0\1\3\44\0"+
    "\1\24\12\0\1\24\4\0\1\24\5\0\27\24\1\0"+
    "\37\24\1\0\u01ca\24\4\0\14\24\16\0\5\24\7\0"+
    "\1\24\1\0\1\24\201\0\5\24\1\0\2\24\2\0"+
    "\4\24\1\0\1\24\6\0\1\24\1\0\3\24\1\0"+
    "\1\24\1\0\24\24\1\0\123\24\1\0\213\24\10\0"+
    "\246\24\1\0\46\24\2\0\1\24\6\0\51\24\107\0"+
    "\33\24\4\0\4\24\55\0\53\24\25\0\12\16\4\0"+
    "\2\24\1\0\143\24\1\0\1\24\17\0\2\24\7\0"+
    "\2\24\12\16\3\24\2\0\1\24\20\0\1\24\1\0"+
    "\36\24\35\0\131\24\13\0\1\24\16\0\12\16\41\24"+
    "\11\0\2\24\4\0\1\24\5\0\26\24\4\0\1\24"+
    "\11\0\1\24\3\0\1\24\27\0\31\24\7\0\13\24"+
    "\65\0\25\24\1\0\10\24\106\0\66\24\3\0\1\24"+
    "\22\0\1\24\7\0\12\24\4\0\12\16\1\0\20\24"+
    "\4\0\10\24\2\0\2\24\2\0\26\24\1\0\7\24"+
    "\1\0\1\24\3\0\4\24\3\0\1\24\20\0\1\24"+
    "\15\0\2\24\1\0\3\24\4\0\12\16\2\24\12\0"+
    "\1\24\10\0\6\24\4\0\2\24\2\0\26\24\1\0"+
    "\7\24\1\0\2\24\1\0\2\24\1\0\2\24\37\0"+
    "\4\24\1\0\1\24\7\0\12\16\2\0\3\24\20\0"+
    "\11\24\1\0\3\24\1\0\26\24\1\0\7\24\1\0"+
    "\2\24\1\0\5\24\3\0\1\24\22\0\1\24\17\0"+
    "\2\24\4\0\12\16\11\0\1\24\13\0\10\24\2\0"+
    "\2\24\2\0\26\24\1\0\7\24\1\0\2\24\1\0"+
    "\5\24\3\0\1\24\36\0\2\24\1\0\3\24\4\0"+
    "\12\16\1\0\1\24\21\0\1\24\1\0\6\24\3\0"+
    "\3\24\1\0\4\24\3\0\2\24\1\0\1\24\1\0"+
    "\2\24\3\0\2\24\3\0\3\24\3\0\14\24\26\0"+
    "\1\24\25\0\12\16\25\0\10\24\1\0\3\24\1\0"+
    "\27\24\1\0\20\24\3\0\1\24\32\0\3\24\5\0"+
    "\2\24\4\0\12\16\20\0\1\24\4\0\10\24\1\0"+
    "\3\24\1\0\27\24\1\0\12\24\1\0\5\24\3\0"+
    "\1\24\40\0\1\24\1\0\2\24\4\0\12\16\1\0"+
    "\2\24\22\0\10\24\1\0\3\24\1\0\51\24\2\0"+
    "\1\24\20\0\1\24\5\0\3\24\10\0\3\24\4\0"+
    "\12\16\12\0\6\24\5\0\22\24\3\0\30\24\1\0"+
    "\11\24\1\0\1\24\2\0\7\24\37\0\12\16\21\0"+
    "\60\24\1\0\2\24\14\0\7\24\11\0\12\16\47\0"+
    "\2\24\1\0\1\24\1\0\5\24\1\0\30\24\1\0"+
    "\1\24\1\0\12\24\1\0\2\24\11\0\1\24\2\0"+
    "\5\24\1\0\1\24\11\0\12\16\2\0\4\24\40\0"+
    "\1\24\37\0\12\16\26\0\10\24\1\0\44\24\33\0"+
    "\5\24\163\0\53\24\24\0\1\24\12\16\6\0\6\24"+
    "\4\0\4\24\3\0\1\24\3\0\2\24\7\0\3\24"+
    "\4\0\15\24\14\0\1\24\1\0\12\16\6\0\46\24"+
    "\1\0\1\24\5\0\1\24\2\0\53\24\1\0\115\24"+
    "\1\0\4\24\2\0\7\24\1\0\1\24\1\0\4\24"+
    "\2\0\51\24\1\0\4\24\2\0\41\24\1\0\4\24"+
    "\2\0\7\24\1\0\1\24\1\0\4\24\2\0\17\24"+
    "\1\0\71\24\1\0\4\24\2\0\103\24\45\0\20\24"+
    "\20\0\126\24\2\0\6\24\3\0\u016c\24\2\0\21\24"+
    "\1\0\32\24\5\0\113\24\6\0\10\24\7\0\15\24"+
    "\1\0\4\24\16\0\22\24\16\0\22\24\16\0\15\24"+
    "\1\0\3\24\17\0\64\24\43\0\1\24\4\0\1\24"+
    "\3\0\12\16\46\0\12\16\6\0\131\24\7\0\5\24"+
    "\2\0\42\24\1\0\1\24\5\0\106\24\12\0\37\24"+
    "\47\0\12\16\36\24\2\0\5\24\13\0\54\24\4\0"+
    "\32\24\6\0\12\16\46\0\27\24\11\0\65\24\53\0"+
    "\12\16\6\0\12\16\15\0\1\24\135\0\57\24\21\0"+
    "\7\24\4\0\12\16\51\0\36\24\15\0\2\24\12\16"+
    "\54\24\32\0\44\24\34\0\12\16\3\0\3\24\12\16"+
    "\44\24\2\0\11\24\7\0\53\24\2\0\3\24\51\0"+
    "\4\24\1\0\6\24\1\0\2\24\3\0\1\24\5\0"+
    "\300\24\100\0\26\24\2\0\6\24\2\0\46\24\2\0"+
    "\6\24\2\0\10\24\1\0\1\24\1\0\1\24\1\0"+
    "\1\24\1\0\37\24\2\0\65\24\1\0\7\24\1\0"+
    "\1\24\3\0\3\24\1\0\7\24\3\0\4\24\2\0"+
    "\6\24\4\0\15\24\5\0\3\24\1\0\7\24\53\0"+
    "\2\3\107\0\1\24\15\0\1\24\20\0\15\24\145\0"+
    "\1\24\4\0\1\24\2\0\12\24\1\0\1\24\3\0"+
    "\5\24\6\0\1\24\1\0\1\24\1\0\1\24\1\0"+
    "\4\24\1\0\13\24\2\0\4\24\5\0\5\24\4\0"+
    "\1\24\64\0\2\24\u017b\0\57\24\1\0\57\24\1\0"+
    "\205\24\6\0\4\24\3\0\2\24\14\0\46\24\1\0"+
    "\1\24\5\0\1\24\2\0\70\24\7\0\1\24\20\0"+
    "\27\24\11\0\7\24\1\0\7\24\1\0\7\24\1\0"+
    "\7\24\1\0\7\24\1\0\7\24\1\0\7\24\1\0"+
    "\7\24\120\0\1\24\325\0\2\24\52\0\5\24\5\0"+
    "\2\24\4\0\126\24\6\0\3\24\1\0\132\24\1\0"+
    "\4\24\5\0\53\24\1\0\136\24\21\0\33\24\65\0"+
    "\306\24\112\0\360\24\20\0\215\24\103\0\56\24\2\0"+
    "\15\24\3\0\20\24\12\16\2\24\24\0\57\24\20\0"+
    "\37\24\2\0\106\24\61\0\11\24\2\0\147\24\2\0"+
    "\65\24\2\0\5\24\60\0\13\24\1\0\3\24\1\0"+
    "\4\24\1\0\27\24\35\0\64\24\16\0\62\24\34\0"+
    "\12\16\30\0\6\24\3\0\1\24\1\0\2\24\1\0"+
    "\12\16\34\24\12\0\27\24\31\0\35\24\7\0\57\24"+
    "\34\0\1\24\12\16\6\0\5\24\1\0\12\24\12\16"+
    "\5\24\1\0\51\24\27\0\3\24\1\0\10\24\4\0"+
    "\12\16\6\0\27\24\3\0\1\24\3\0\62\24\1\0"+
    "\1\24\3\0\2\24\2\0\5\24\2\0\1\24\1\0"+
    "\1\24\30\0\3\24\2\0\13\24\7\0\3\24\14\0"+
    "\6\24\2\0\6\24\2\0\6\24\11\0\7\24\1\0"+
    "\7\24\1\0\53\24\1\0\14\24\10\0\163\24\15\0"+
    "\12\16\6\0\244\24\14\0\27\24\4\0\61\24\4\0"+
    "\u0100\3\156\24\2\0\152\24\46\0\7\24\14\0\5\24"+
    "\5\0\1\24\1\0\12\24\1\0\15\24\1\0\5\24"+
    "\1\0\1\24\1\0\2\24\1\0\2\24\1\0\154\24"+
    "\41\0\153\24\22\0\100\24\2\0\66\24\50\0\14\24"+
    "\164\0\5\24\1\0\207\24\23\0\12\16\7\0\32\24"+
    "\6\0\32\24\13\0\131\24\3\0\6\24\2\0\6\24"+
    "\2\0\6\24\2\0\3\24\43\0\14\24\1\0\32\24"+
    "\1\0\23\24\1\0\2\24\1\0\17\24\2\0\16\24"+
    "\42\0\173\24\205\0\35\24\3\0\61\24\57\0\40\24"+
    "\15\0\24\24\1\0\10\24\6\0\46\24\12\0\36\24"+
    "\2\0\44\24\4\0\10\24\60\0\236\24\2\0\12\16"+
    "\6\0\44\24\4\0\44\24\4\0\50\24\10\0\64\24"+
    "\234\0\67\24\11\0\26\24\12\0\10\24\230\0\6\24"+
    "\2\0\1\24\1\0\54\24\1\0\2\24\3\0\1\24"+
    "\2\0\27\24\12\0\27\24\11\0\37\24\101\0\23\24"+
    "\1\0\2\24\12\0\26\24\12\0\32\24\106\0\70\24"+
    "\6\0\2\24\100\0\1\24\17\0\4\24\1\0\3\24"+
    "\1\0\35\24\52\0\35\24\3\0\35\24\43\0\10\24"+
    "\1\0\34\24\33\0\66\24\12\0\26\24\12\0\23\24"+
    "\15\0\22\24\156\0\111\24\67\0\63\24\15\0\63\24"+
    "\15\0\44\24\14\0\12\16\306\0\35\24\12\0\1\24"+
    "\10\0\26\24\232\0\27\24\14\0\65\24\56\0\12\16"+
    "\23\0\55\24\40\0\31\24\7\0\12\16\11\0\44\24"+
    "\17\0\12\16\4\0\1\24\13\0\43\24\3\0\1\24"+
    "\14\0\60\24\16\0\4\24\13\0\12\16\1\24\1\0"+
    "\1\24\43\0\22\24\1\0\31\24\124\0\7\24\1\0"+
    "\1\24\1\0\4\24\1\0\17\24\1\0\12\24\7\0"+
    "\57\24\21\0\12\16\13\0\10\24\2\0\2\24\2\0"+
    "\26\24\1\0\7\24\1\0\2\24\1\0\5\24\3\0"+
    "\1\24\22\0\1\24\14\0\5\24\236\0\65\24\22\0"+
    "\4\24\5\0\12\16\5\0\1\24\40\0\60\24\24\0"+
    "\2\24\1\0\1\24\10\0\12\16\246\0\57\24\51\0"+
    "\4\24\44\0\60\24\24\0\1\24\13\0\12\16\46\0"+
    "\53\24\15\0\1\24\7\0\12\16\66\0\33\24\25\0"+
    "\12\16\306\0\54\24\164\0\100\24\12\16\25\0\1\24"+
    "\240\0\10\24\2\0\47\24\20\0\1\24\1\0\1\24"+
    "\34\0\1\24\12\0\50\24\7\0\1\24\25\0\1\24"+
    "\13\0\56\24\23\0\1\24\42\0\71\24\7\0\11\24"+
    "\1\0\45\24\21\0\1\24\17\0\12\16\30\0\36\24"+
    "\160\0\7\24\1\0\2\24\1\0\46\24\25\0\1\24"+
    "\11\0\12\16\6\0\6\24\1\0\2\24\1\0\40\24"+
    "\16\0\1\24\7\0\12\16\u0136\0\23\24\15\0\232\24"+
    "\346\0\304\24\274\0\57\24\321\0\107\24\271\0\71\24"+
    "\7\0\37\24\1\0\12\16\146\0\36\24\22\0\60\24"+
    "\20\0\4\24\14\0\12\16\11\0\25\24\5\0\23\24"+
    "\260\0\100\24\200\0\113\24\5\0\1\24\102\0\15\24"+
    "\100\0\2\24\1\0\1\24\34\0\370\24\10\0\363\24"+
    "\15\0\37\24\61\0\3\24\21\0\4\24\10\0\u018c\24"+
    "\4\0\153\24\5\0\15\24\3\0\11\24\7\0\12\24"+
    "\146\0\125\24\1\0\107\24\1\0\2\24\2\0\1\24"+
    "\2\0\2\24\2\0\4\24\1\0\14\24\1\0\1\24"+
    "\1\0\7\24\1\0\101\24\1\0\4\24\2\0\10\24"+
    "\1\0\7\24\1\0\34\24\1\0\4\24\1\0\5\24"+
    "\1\0\1\24\3\0\7\24\1\0\u0154\24\2\0\31\24"+
    "\1\0\31\24\1\0\37\24\1\0\31\24\1\0\37\24"+
    "\1\0\31\24\1\0\37\24\1\0\31\24\1\0\37\24"+
    "\1\0\31\24\1\0\10\24\2\0\62\16\55\24\12\0"+
    "\7\24\2\0\12\16\4\0\1\24\u0171\0\54\24\4\0"+
    "\12\16\6\0\305\24\73\0\104\24\7\0\1\24\4\0"+
    "\12\16\246\0\4\24\1\0\33\24\1\0\2\24\1\0"+
    "\1\24\2\0\1\24\1\0\12\24\1\0\4\24\1\0"+
    "\1\24\1\0\1\24\6\0\1\24\4\0\1\24\1\0"+
    "\1\24\1\0\1\24\1\0\3\24\1\0\2\24\1\0"+
    "\1\24\2\0\1\24\1\0\1\24\1\0\1\24\1\0"+
    "\1\24\1\0\1\24\1\0\2\24\1\0\1\24\2\0"+
    "\4\24\1\0\7\24\1\0\4\24\1\0\4\24\1\0"+
    "\1\24\1\0\12\24\1\0\21\24\5\0\3\24\1\0"+
    "\5\24\1\0\21\24\104\0\327\24\51\0\65\24\13\0"+
    "\336\24\2\0\u0182\24\16\0\u0131\24\37\0\36\24\342\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[27904];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\2\1\3\1\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\1\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\17\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\0\7\20\1\27\4\20\1\30\5\20"+
    "\1\31\1\20\1\32\5\20\1\33\1\34\6\20\1\35"+
    "\1\36\1\37\1\40\2\20\1\41\2\20\1\42\3\20"+
    "\1\43\1\44\1\20\1\45\1\20\1\46\1\47\10\20"+
    "\1\50\4\20\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[109];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\54\0\130\0\204\0\54\0\54\0\54"+
    "\0\54\0\54\0\260\0\54\0\334\0\u0108\0\54\0\54"+
    "\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268"+
    "\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\u039c\0\u03c8"+
    "\0\u03f4\0\u0420\0\54\0\54\0\54\0\54\0\54\0\54"+
    "\0\u044c\0\u0478\0\u04a4\0\u04d0\0\u04fc\0\u0528\0\u0554\0\u0580"+
    "\0\u01b8\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u01b8\0\u065c\0\u0688"+
    "\0\u06b4\0\u06e0\0\u070c\0\u01b8\0\u0738\0\u01b8\0\u0764\0\u0790"+
    "\0\u07bc\0\u07e8\0\u0814\0\u01b8\0\u01b8\0\u0840\0\u086c\0\u0898"+
    "\0\u08c4\0\u08f0\0\u091c\0\u01b8\0\u01b8\0\u01b8\0\u01b8\0\u0948"+
    "\0\u0974\0\u01b8\0\u09a0\0\u09cc\0\u01b8\0\u09f8\0\u0a24\0\u0a50"+
    "\0\u01b8\0\u01b8\0\u0a7c\0\u01b8\0\u0aa8\0\u01b8\0\u01b8\0\u0ad4"+
    "\0\u0b00\0\u0b2c\0\u0b58\0\u0b84\0\u0bb0\0\u0bdc\0\u0c08\0\u0c34"+
    "\0\u0c60\0\u0c8c\0\u0cb8\0\u0ce4\0\u01b8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[109];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\3\24\1\25\1\24\1\2\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\2\24\1\35"+
    "\1\36\1\37\1\40\1\24\1\41\1\24\1\42\1\24"+
    "\76\0\1\43\31\0\2\5\2\0\50\5\23\0\1\44"+
    "\45\0\1\45\54\0\1\16\57\0\1\46\53\0\1\47"+
    "\53\0\1\50\47\0\1\24\5\0\5\24\1\51\22\24"+
    "\16\0\1\24\5\0\5\24\1\51\6\24\1\52\13\24"+
    "\16\0\1\24\5\0\5\24\1\51\11\24\1\53\10\24"+
    "\16\0\1\24\5\0\5\24\1\51\12\24\1\54\7\24"+
    "\16\0\1\24\5\0\5\24\1\51\3\24\1\55\16\24"+
    "\16\0\1\24\5\0\5\24\1\51\7\24\1\56\12\24"+
    "\16\0\1\24\5\0\5\24\1\51\14\24\1\57\5\24"+
    "\16\0\1\24\5\0\5\24\1\51\3\24\1\60\16\24"+
    "\16\0\1\24\5\0\5\24\1\51\4\24\1\61\3\24"+
    "\1\62\1\63\10\24\16\0\1\24\5\0\5\24\1\51"+
    "\12\24\1\64\4\24\1\65\2\24\16\0\1\24\5\0"+
    "\5\24\1\51\14\24\1\66\5\24\16\0\1\24\5\0"+
    "\5\24\1\51\14\24\1\67\5\24\16\0\1\24\5\0"+
    "\5\24\1\51\3\24\1\70\16\24\16\0\1\24\5\0"+
    "\5\24\1\51\1\71\21\24\16\0\1\24\5\0\5\24"+
    "\1\51\5\24\1\72\14\24\16\0\1\24\5\0\5\24"+
    "\1\0\22\24\16\0\1\24\5\0\5\24\1\51\1\24"+
    "\1\73\20\24\16\0\1\24\5\0\5\24\1\51\2\24"+
    "\1\74\17\24\16\0\1\24\5\0\5\24\1\51\11\24"+
    "\1\75\10\24\16\0\1\24\5\0\5\24\1\51\4\24"+
    "\1\76\15\24\16\0\1\24\5\0\5\24\1\51\15\24"+
    "\1\77\4\24\16\0\1\24\5\0\5\24\1\51\12\24"+
    "\1\100\7\24\16\0\1\24\5\0\5\24\1\51\1\101"+
    "\21\24\16\0\1\24\5\0\5\24\1\51\13\24\1\102"+
    "\6\24\16\0\1\24\5\0\5\24\1\51\13\24\1\103"+
    "\2\24\1\104\3\24\16\0\1\24\5\0\5\24\1\51"+
    "\16\24\1\105\3\24\16\0\1\24\5\0\5\24\1\51"+
    "\7\24\1\106\12\24\16\0\1\24\5\0\5\24\1\51"+
    "\6\24\1\107\13\24\16\0\1\24\5\0\5\24\1\51"+
    "\16\24\1\110\3\24\16\0\1\24\5\0\5\24\1\51"+
    "\6\24\1\111\13\24\16\0\1\24\5\0\5\24\1\51"+
    "\6\24\1\112\13\24\16\0\1\24\5\0\5\24\1\51"+
    "\14\24\1\113\5\24\16\0\1\24\5\0\5\24\1\51"+
    "\15\24\1\114\4\24\16\0\1\24\5\0\5\24\1\51"+
    "\3\24\1\115\16\24\16\0\1\24\5\0\5\24\1\51"+
    "\10\24\1\116\11\24\16\0\1\24\5\0\5\24\1\51"+
    "\2\24\1\117\17\24\16\0\1\24\5\0\5\24\1\51"+
    "\12\24\1\120\7\24\16\0\1\24\5\0\5\24\1\51"+
    "\17\24\1\121\2\24\16\0\1\24\5\0\5\24\1\51"+
    "\7\24\1\122\12\24\16\0\1\24\5\0\5\24\1\51"+
    "\11\24\1\123\10\24\16\0\1\24\5\0\5\24\1\51"+
    "\17\24\1\124\2\24\16\0\1\24\5\0\5\24\1\51"+
    "\7\24\1\125\12\24\16\0\1\24\5\0\5\24\1\51"+
    "\7\24\1\126\12\24\16\0\1\24\5\0\5\24\1\51"+
    "\12\24\1\127\7\24\16\0\1\24\5\0\5\24\1\51"+
    "\14\24\1\130\5\24\16\0\1\24\5\0\5\24\1\51"+
    "\16\24\1\131\3\24\16\0\1\24\5\0\5\24\1\51"+
    "\16\24\1\132\3\24\16\0\1\24\5\0\5\24\1\51"+
    "\14\24\1\133\5\24\16\0\1\24\5\0\5\24\1\51"+
    "\3\24\1\134\16\24\16\0\1\24\5\0\4\24\1\135"+
    "\1\51\22\24\16\0\1\24\5\0\5\24\1\51\16\24"+
    "\1\136\3\24\16\0\1\24\5\0\5\24\1\51\11\24"+
    "\1\137\10\24\16\0\1\24\5\0\5\24\1\51\21\24"+
    "\1\140\16\0\1\24\5\0\5\24\1\51\16\24\1\141"+
    "\3\24\16\0\1\24\5\0\5\24\1\51\5\24\1\142"+
    "\14\24\16\0\1\24\5\0\5\24\1\51\12\24\1\143"+
    "\7\24\16\0\1\24\5\0\5\24\1\51\11\24\1\144"+
    "\10\24\16\0\1\24\5\0\2\24\1\145\2\24\1\51"+
    "\22\24\16\0\1\24\5\0\5\24\1\51\6\24\1\146"+
    "\13\24\16\0\1\24\5\0\5\24\1\51\15\24\1\147"+
    "\4\24\16\0\1\24\5\0\5\24\1\51\16\24\1\150"+
    "\3\24\16\0\1\24\5\0\1\24\1\151\3\24\1\51"+
    "\22\24\16\0\1\24\5\0\5\24\1\51\7\24\1\152"+
    "\12\24\16\0\1\24\5\0\5\24\1\51\1\153\21\24"+
    "\16\0\1\24\5\0\5\24\1\51\15\24\1\154\4\24"+
    "\16\0\1\24\5\0\5\24\1\51\15\24\1\155\4\24";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3344];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\2\1\5\11\1\1\1\11\2\1\2\11"+
    "\22\1\6\11\1\0\104\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[109];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  private void echo () { System . out . print (yytext ()); }

  public int position () { return yycolumn; }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  MicroPythonLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          {   { return new Token (Symbol . EOF); }
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { echo (); ErrorMessage . print ( "Illegal character");
            }
            // fall through
          case 42: break;
          case 2:
            { echo ();
            }
            // fall through
          case 43: break;
          case 3:
            { echo (); return new Token (Symbol . LPAREN);
            }
            // fall through
          case 44: break;
          case 4:
            { echo (); return new Token (Symbol . RPAREN);
            }
            // fall through
          case 45: break;
          case 5:
            { echo (); return new Token (Symbol . MULT_OP, "*");
            }
            // fall through
          case 46: break;
          case 6:
            { echo (); return new Token (Symbol . ADD_OP, "+");
            }
            // fall through
          case 47: break;
          case 7:
            { echo (); return new Token (Symbol . COMMA);
            }
            // fall through
          case 48: break;
          case 8:
            { echo (); return new Token (Symbol . ADD_OP, "-");
            }
            // fall through
          case 49: break;
          case 9:
            { echo (); return new Token (Symbol . PERIOD);
            }
            // fall through
          case 50: break;
          case 10:
            { echo (); return new Token (Symbol . INTEGER, yytext ());
            }
            // fall through
          case 51: break;
          case 11:
            { echo (); return new Token (Symbol . COLON);
            }
            // fall through
          case 52: break;
          case 12:
            { echo (); return new Token (Symbol . SEMICOLON);
            }
            // fall through
          case 53: break;
          case 13:
            { echo (); return new Token (Symbol . REL_OP, "<");
            }
            // fall through
          case 54: break;
          case 14:
            { echo (); return new Token (Symbol . ASSIGN);
            }
            // fall through
          case 55: break;
          case 15:
            { echo (); return new Token (Symbol . REL_OP, ">");
            }
            // fall through
          case 56: break;
          case 16:
            { echo (); return new Token (Symbol . ID, yytext ());
            }
            // fall through
          case 57: break;
          case 17:
            { echo (); return new Token (Symbol . REL_OP, "!=");
            }
            // fall through
          case 58: break;
          case 18:
            { echo (); return new Token (Symbol . RETURNS);
            }
            // fall through
          case 59: break;
          case 19:
            { echo (); return new Token (Symbol . MULT_OP, "//");
            }
            // fall through
          case 60: break;
          case 20:
            { echo (); return new Token (Symbol . REL_OP, "<=");
            }
            // fall through
          case 61: break;
          case 21:
            { echo (); return new Token (Symbol . REL_OP, "==");
            }
            // fall through
          case 62: break;
          case 22:
            { echo (); return new Token (Symbol . REL_OP, ">=");
            }
            // fall through
          case 63: break;
          case 23:
            { echo (); return new Token (Symbol . IF);
            }
            // fall through
          case 64: break;
          case 24:
            { echo (); return new Token (Symbol . OR);
            }
            // fall through
          case 65: break;
          case 25:
            { echo (); return new Token (Symbol . AND);
            }
            // fall through
          case 66: break;
          case 26:
            { echo (); return new Token (Symbol . DEF);
            }
            // fall through
          case 67: break;
          case 27:
            { echo (); return new Token (Symbol . INT);
            }
            // fall through
          case 68: break;
          case 28:
            { echo (); return new Token (Symbol . NOT);
            }
            // fall through
          case 69: break;
          case 29:
            { echo (); return new Token (Symbol . CONS);
            }
            // fall through
          case 70: break;
          case 30:
            { echo (); return new Token (Symbol . ELSE);
            }
            // fall through
          case 71: break;
          case 31:
            { echo (); return new Token (Symbol . FROM);
            }
            // fall through
          case 72: break;
          case 32:
            { echo (); return new Token (Symbol . HEAD);
            }
            // fall through
          case 73: break;
          case 33:
            { echo (); return new Token (Symbol . NULL);
            }
            // fall through
          case 74: break;
          case 34:
            { echo (); return new Token (Symbol . TAIL);
            }
            // fall through
          case 75: break;
          case 35:
            { echo (); return new Token (Symbol . INPUT);
            }
            // fall through
          case 76: break;
          case 36:
            { echo (); return new Token (Symbol . PRINT);
            }
            // fall through
          case 77: break;
          case 37:
            { echo (); return new Token (Symbol . WHILE);
            }
            // fall through
          case 78: break;
          case 38:
            { echo (); return new Token (Symbol . IMPORT);
            }
            // fall through
          case 79: break;
          case 39:
            { echo (); return new Token (Symbol . RETURN);
            }
            // fall through
          case 80: break;
          case 40:
            { echo (); return new Token (Symbol . MICRO_PYTHON_LIST);
            }
            // fall through
          case 81: break;
          case 41:
            { echo (); return new Token (Symbol . MICRO_PYTHON_LIST_CLASS);
            }
            // fall through
          case 82: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}