package com.toyRobot.command;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.toyRobot.status.Status;
import com.toyRobot.status.Face;

public class CommandsTest {
	private Status status;
	private Command left;
	private Command right;
	private Command move;
	private Command place;
	private Command report;

	@BeforeEach
	public void setup() {
		this.status = new Status(2, 2, Face.NORTH);
	}

	@Test
	public void testLeft() {
		this.left = new Left();

		assertEquals(new Status(2, 2, Face.WEST),
				this.left.execute(new Status(2, 2, Face.NORTH)));

		assertEquals(new Status(2, 2, Face.NORTH),
				this.left.execute(new Status(2, 2, Face.EAST)));

		assertEquals(new Status(2, 2, Face.EAST),
				this.left.execute(new Status(2, 2, Face.SOUTH)));

		assertEquals(new Status(2, 2, Face.SOUTH),
				this.left.execute(new Status(2, 2, Face.WEST)));
	}

	@Test
	void testRight() {
		this.right = new Right();

		assertEquals(new Status(2, 2, Face.EAST),
				this.right.execute(this.status));
	}

	@Test
	void testMove() {
		this.move = new Move();

		assertEquals(new Status(2, 3, Face.NORTH),
				this.move.execute(this.status));
	}

	@Test
	void testPlace() {
		this.place = new Place(0, 0, Face.NORTH);

		assertEquals(new Status(0, 0, Face.NORTH),
				this.place.execute(this.status));
	}

	@Test
	void testReport() {
		this.report = new Report();

		assertEquals(new Status(2, 2, Face.NORTH),
				this.report.execute(this.status));
	}

}
