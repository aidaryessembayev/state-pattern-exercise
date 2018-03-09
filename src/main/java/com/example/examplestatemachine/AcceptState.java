package com.example.examplestatemachine;

public class AcceptState extends State {
	
	StateContext theContext;
	
	public AcceptState (StateContext theContext) {
		this.theContext = theContext;
	}
	
	@Override
	public void actionA() {

		if (theContext.getState() == theContext.getAcceptStateB()) {
			
			System.out.println ("I'm in accept state. ActionA");
			
			State state = theContext.getRejectStateB();
			theContext.setState(state);
			
			theContext.getState().accept = false;
			
		}
	}
	
	@Override
	public void actionB() {

		if (theContext.getState() == theContext.getAcceptStateA()) {
			
			System.out.println ("I'm in accept state. ActionB");
			
			State state = theContext.getRejectStateA();
			theContext.setState(state);
			
			theContext.getState().accept = false;
			
		}
	}

}
