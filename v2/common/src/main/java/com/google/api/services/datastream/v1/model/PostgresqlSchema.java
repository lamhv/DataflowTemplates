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
 * PostgreSQL schema.
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Datastream API. For a detailed explanation see: <a
 * href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PostgresqlSchema extends com.google.api.client.json.GenericJson {

  /** Tables in the schema. The value may be {@code null}. */
  @com.google.api.client.util.Key private java.util.List<PostgresqlTable> postgresqlTables;

  /** Schema name. The value may be {@code null}. */
  @com.google.api.client.util.Key private String schema;

  /**
   * Tables in the schema.
   *
   * @return value or {@code null} for none
   */
  public java.util.List<PostgresqlTable> getPostgresqlTables() {
    return postgresqlTables;
  }

  /**
   * Tables in the schema.
   *
   * @param postgresqlTables postgresqlTables or {@code null} for none
   */
  public PostgresqlSchema setOracleTables(java.util.List<PostgresqlTable> postgresqlTables) {
    this.postgresqlTables = postgresqlTables;
    return this;
  }

  /**
   * Schema name.
   *
   * @return value or {@code null} for none
   */
  public String getSchema() {
    return schema;
  }

  /**
   * Schema name.
   *
   * @param schema schema or {@code null} for none
   */
  public PostgresqlSchema setSchema(String schema) {
    this.schema = schema;
    return this;
  }

  @Override
  public PostgresqlSchema set(String fieldName, Object value) {
    return (PostgresqlSchema) super.set(fieldName, value);
  }

  @Override
  public PostgresqlSchema clone() {
    return (PostgresqlSchema) super.clone();
  }
}
