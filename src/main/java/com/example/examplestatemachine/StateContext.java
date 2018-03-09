package com.example.examplestatemachine;

public class StateContext {
	
	State acceptStateA;
	State rejectStateA;
	
	State acceptStateB;
	State rejectStateB;
	
	State initState;
	State s;
	
	public StateContext () {
		
		this.acceptStateA = new AcceptState(this);
		this.rejectStateA = new RejectState(this);
		
		this.acceptStateB = new AcceptState(this);
		this.rejectStateB = new RejectState(this);
		
		this.initState = new RejectState(this);
		s = initState;
		
	}
	
	public State getState() {
		return s;
	}

	public void setState(State state) {
		s = state;
	}
	
	public void actionA() {
		// TODO Auto-generated method stub
		s.actionA();
	}
	
	public void actionB() {
		// TODO Auto-generated method stub
		s.actionB();
	}

	public boolean isAccept() {
		// TODO Auto-generated method stub
		return s.isAccept();
	}

	public State getAcceptStateA() {
		return acceptStateA;
	}

	public void setAcceptStateA(State acceptStateA) {
		this.acceptStateA = acceptStateA;
	}

	public State getRejectStateA() {
		return rejectStateA;
	}

	public void setRejectStateA(State rejectStateA) {
		this.rejectStateA = rejectStateA;
	}

	public State getAcceptStateB() {
		return acceptStateB;
	}

	public void setAcceptStateB(State acceptStateB) {
		this.acceptStateB = acceptStateB;
	}

	public State getRejectStateB() {
		return rejectStateB;
	}

	public void setRejectStateB(State rejectStateB) {
		this.rejectStateB = rejectStateB;
	}

	public State getInitState() {
		return initState;
	}

	public void setInitState(State initState) {
		this.initState = initState;
	}

}
