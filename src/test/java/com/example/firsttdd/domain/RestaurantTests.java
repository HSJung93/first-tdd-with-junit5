package com.example.firsttdd.domain;

import org.junit.jupiter.api.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RestaurantTests {

  @Test
  public void creation() {
    // 객체가 잘 만들어 지는가?
    Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
    assertThat(restaurant.getName(), is("Bob zip"));
    assertThat(restaurant.getAddress(), is("Seoul"));
  }

  @Test
  public void information() {
    Restaurant restaurant = new Restaurant("Bob zip", "Seoul");
    assertThat(restaurant.getInformation(), is("Bob zip in Seoul"));
  }
}
