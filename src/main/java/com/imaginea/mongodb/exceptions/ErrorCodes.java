/*
 * Copyright (c) 2011 Imaginea Technologies Private Ltd.
 * Hyderabad, India
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following condition
 * is met:
 *
 *     + Neither the name of Imaginea, nor the
 *       names of its contributors may be used to endorse or promote
 *       products derived from this software.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.imaginea.mongodb.exceptions;

/**
 * Defines Error Codes for Exceptions thrown in MongoDb while performing
 * operations in Services Files.
 *
 */

public interface ErrorCodes {

	String DB_DOES_NOT_EXISTS = "DB_DOES_NOT_EXISTS";
	String DB_ALREADY_EXISTS = "DB_ALREADY_EXISTS";
	String DB_NAME_EMPTY = "DB_NAME_EMPTY";
	String HOST_UNKNOWN = "HOST_UNKNOWN";
	String COLLECTION_ALREADY_EXISTS = "COLLECTION_ALREADY_EXISTS";
	String COLLECTION_DOES_NOT_EXIST = "COLLECTION_DOES_NOT_EXIST";
	String COLLECTION_NAME_EMPTY = "COLLECTION_NAME_EMPTY";
	String DOCUMENT_DOES_NOT_EXIST = "DOCUMENT_DOES_NOT_EXIST";
	String DOCUMENT_EMPTY = "DOCUMENT_EMPTY";
	String JSON_EXCEPTION = "JSON_EXCEPTION";
	String SERVLET_CONFIG_NOT_SET = "SERVLET_CONFIG_NOT_SET";
	String INVALID_OBJECT_ID = "INVALID_OBJECT_ID";
	String GET_DB_LIST_EXCEPTION = "GET_DB_LIST_EXCEPTION";
	String DB_DELETION_EXCEPTION = "DB_DELETION_EXCEPTION";
	String GET_COLLECTION_LIST_EXCEPTION = "GET_COLLECTION_LIST_EXCEPTION";
	String GET_DOCUMENT_LIST_EXCEPTION = "GET_DOCUMENT_LIST_EXCEPTION";
	String DOCUMENT_DELETION_EXCEPTION = "DOCUMENT_DELETION_EXCEPTION";
	String DOCUMENT_CREATION_EXCEPTION = "DOCUMENT_CREATION_EXCEPTION";
	String DOCUMENT_UPDATE_EXCEPTION = "DOCUMENT_UPDATE_EXCEPTION";
	String DB_CREATION_EXCEPTION = "DB_CREATION_EXCEPTION";
	String COLLECTION_DELETION_EXCEPTION = "COLLECTION_DELETION_EXCEPTION";
	String TOKEN_ID_ABSENT = "TOKEN_ID_ABSENT";
	String ACTION_PARAMETER_ABSENT = "ACTION_PARAMETER_ABSENT";
	String INVALID_SESSION = "INVALID_SESSION";
	String GET_DB_STATS_EXCEPTION = "GET_DB_STATS_EXCEPTION";
	String GET_COLL_STATS_EXCEPTION = "GET_COLL_STATS_EXCEPTION";
	String COLLECTION_CREATION_EXCEPTION = "COLLECTION_CREATION_EXCEPTION";
	String MISSING_LOGIN_FIELDS = "MISSING_LOGIN_FIELDS";
	String INVALID_USERNAME = "INVALID_USERNAME";
    String NEED_AUTHORISATION = "NEED_AUTHORISATION";
	String ERROR_INITIATING_GRAPH = "ERROR_INITIATING_GRAPH";
    String INVALID_ARGUMENT = "INVALID_ARGUMENT";
	// For General Exception catching at the end
	String ANY_OTHER_EXCEPTION = "ANY_OTHER_EXCEPTION";
	String ERROR_PARSING_PORT = "ERROR_PARSING_PORT";
	// mongo.config file not found ni configMongoInstanceProvider
	String FILE_NOT_FOUND_EXCEPTION = "FILE_NOT_FOUND_EXCEPTION";
	String IO_EXCEPTION = "IO_EXCEPTION";
	// In Graph
	String ERROR_PARSING_POLLING_INTERVAL = "ERROR_PARSING_POLLING_INTERVAL";
	String LOGGING_LEVEL_UNDEFINED = "LOGGING_LEVEL_UNDEFINED";
	String DELETING_FROM_CAPPED_COLLECTION = "DELETING_FROM_CAPPED_COLLECTION";
	String INVALID_CONNECTION = "INVALID_CONNECTION";
    String UPLOAD_FILE_EXCEPTION = "UPLOAD_FILE_EXCEPTION";
    String UPDATE_OBJECT_ID_EXCEPTION = "UPDATE_OBJECT_ID_EXCEPTION";

    //Command
    String COMMAND_NOT_SUPPORTED = "Command is not yet supported";
    String COMMAND_ARGUMENTS_NOT_SUFFICIENT= "Command arguments are not sufficient";
}