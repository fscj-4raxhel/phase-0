package com.atguigu.team.service;

public class Status {
	private final String NAME;

	public Status(String name) {
		this.NAME = name;
	}

	public static final Status FREE = new Status("FREE");
	public static final Status BUSY = new Status("BUSY");
	public static final Status VOCATION = new Status("VOCATION");

	public String getName() {
		return this.NAME;
	}

	@Override
	public String toString() {
		return NAME;
	}
}
