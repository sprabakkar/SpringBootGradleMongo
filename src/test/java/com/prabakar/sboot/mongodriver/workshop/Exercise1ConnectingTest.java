package com.prabakar.sboot.mongodriver.workshop;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.mongodb.MongoClient;

public class Exercise1ConnectingTest {
	@Test
	public void shouldCreateANewMongoClientConnectedToLocalhost() throws Exception {
		// When
		// TODO: get/create the MongoClient
		MongoClient mongoClient = null;

		// Then
		assertThat(mongoClient, is(notNullValue()));
	}
}
