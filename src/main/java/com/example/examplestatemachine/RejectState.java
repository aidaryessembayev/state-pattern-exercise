package com.example.examplestatemachine;

public class RejectState extends State {
	
	StateContext theContext;
	
	public RejectState (StateContext theContext) {
		this.theContext = theContext;
	}

	public void actionA() {
		if (theContext.getState() == theContext.getInitState()) {
			
			System.out.println ("I'm in reject state. ActionA");
			
			State state = theContext.getAcceptStateA();
			theContext.setState(state);
			
			theContext.getState().accept = true;
			
		}
		else if(theContext.getState() == theContext.getRejectStateA()) {
			
			System.out.println ("I'm in reject state. ActionA");
			
			State state2 = theContext.getAcceptStateA();
			theContext.setState(state2);
			
			theContext.getState().accept = true;
			
		}
	}
	
	public void actionB() {
		if (theContext.getState() == theContext.getInitState()) {
			
			System.out.println ("I'm in reject state. ActionB");
			
			State state = theContext.getAcceptStateB();
			theContext.setState(state);
			
			theContext.getState().accept = true;
			
		}
		else if(theContext.getState() == theContext.getRejectStateB()) {
			
			System.out.println ("I'm in reject state. ActionB");
			
			State state2 = theContext.getAcceptStateB();
			theContext.setState(state2);
			
			theContext.getState().accept = true;
			
		}
	}
    
}
