/*
 * Forms submission
 * API work with forms
 *
 * OpenAPI spec version: 1.0.0
 * Contact: CARNEIN@allianz.fr
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Pet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-08T08:34:11.196Z")
public class Pet {
  @SerializedName("species")
  private String species = null;

  @SerializedName("race")
  private String race = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("age")
  private String age = null;

  public Pet species(String species) {
    this.species = species;
    return this;
  }

   /**
   * Pet&#39;s species
   * @return species
  **/
  @ApiModelProperty(example = "Cat; Dog", value = "Pet's species")
  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public Pet race(String race) {
    this.race = race;
    return this;
  }

   /**
   * Pet&#39;s race
   * @return race
  **/
  @ApiModelProperty(example = "Persan", value = "Pet's race")
  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public Pet gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Pet&#39;s gender
   * @return gender
  **/
  @ApiModelProperty(example = "Male", value = "Pet's gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Pet age(String age) {
    this.age = age;
    return this;
  }

   /**
   * Pet&#39;s age
   * @return age
  **/
  @ApiModelProperty(example = "8", value = "Pet's age")
  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pet pet = (Pet) o;
    return Objects.equals(this.species, pet.species) &&
        Objects.equals(this.race, pet.race) &&
        Objects.equals(this.gender, pet.gender) &&
        Objects.equals(this.age, pet.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(species, race, gender, age);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

