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
 * PostgreSQL table.
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Datastream API. For a detailed explanation see: <a
 * href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PostgresqlTable extends com.google.api.client.json.GenericJson {

  /**
   * Postgresql columns in the schema. When unspecified as part of include/exclude objects,
   * includes/excludes everything. The value may be {@code null}.
   */
  @com.google.api.client.util.Key private java.util.List<PostgresqlColumn> postgresqlColumns;

  /** Table name. The value may be {@code null}. */
  @com.google.api.client.util.Key private String table;

  /**
   * Postgresql columns in the schema. When unspecified as part of include/exclude objects,
   * includes/excludes everything.
   *
   * @return value or {@code null} for none
   */
  public java.util.List<PostgresqlColumn> getPostgresqlColumns() {
    return postgresqlColumns;
  }

  /**
   * Postgresql columns in the schema. When unspecified as part of include/exclude objects,
   * includes/excludes everything.
   *
   * @param postgresqlColumns postgresqlColumns or {@code null} for none
   */
  public PostgresqlTable setPostgresqlColumns(java.util.List<PostgresqlColumn> postgresqlColumns) {
    this.postgresqlColumns = postgresqlColumns;
    return this;
  }

  /**
   * Table name.
   *
   * @return value or {@code null} for none
   */
  public String getTable() {
    return table;
  }

  /**
   * Table name.
   *
   * @param table table or {@code null} for none
   */
  public PostgresqlTable setTable(String table) {
    this.table = table;
    return this;
  }

  @Override
  public PostgresqlTable set(String fieldName, Object value) {
    return (PostgresqlTable) super.set(fieldName, value);
  }

  @Override
  public PostgresqlTable clone() {
    return (PostgresqlTable) super.clone();
  }
}
