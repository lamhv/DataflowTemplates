/*
 * Copyright (C) 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.api.services.datastream.v1.model;

/**
 * PostgreSQL database structure.
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Datastream API. For a detailed explanation see: <a
 * href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PostgresqlRdbms extends com.google.api.client.json.GenericJson {

  /** PostgreSQL schemas/databases in the database server. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.util.List<PostgresqlSchema> postgresqlSchemas;

  /**
   * PostgreSQL schemas/databases in the database server.
   *
   * @return value or {@code null} for none
   */
  public java.util.List<PostgresqlSchema> getPostgresqlSchemas() {
    return postgresqlSchemas;
  }

  /**
   * PostgreSQL schemas/databases in the database server.
   *
   * @param postgresqlSchemas postgresqlSchemas or {@code null} for none
   */
  public PostgresqlRdbms setPostgresqlSchemas(java.util.List<PostgresqlSchema> postgresqlSchemas) {
    this.postgresqlSchemas = postgresqlSchemas;
    return this;
  }

  @Override
  public PostgresqlRdbms set(String fieldName, Object value) {
    return (PostgresqlRdbms) super.set(fieldName, value);
  }

  @Override
  public PostgresqlRdbms clone() {
    return (PostgresqlRdbms) super.clone();
  }
}
