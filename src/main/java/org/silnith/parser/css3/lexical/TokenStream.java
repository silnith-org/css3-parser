package org.silnith.parser.css3.lexical;

import java.io.IOException;

import org.silnith.parser.css3.Token;


public interface TokenStream {
    
    Token getNextToken() throws IOException;
    
}
