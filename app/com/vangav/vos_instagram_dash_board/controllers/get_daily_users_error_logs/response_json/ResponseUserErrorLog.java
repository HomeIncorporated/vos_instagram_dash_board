/**
 * "First, solve the problem. Then, write the code. -John Johnson"
 * "Or use Vangav M"
 * www.vangav.com
 * */

/**
 * MIT License
 *
 * Copyright (c) 2016 Vangav
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 * */

/**
 * Community
 * Facebook Group: Vangav Open Source - Backend
 *   fb.com/groups/575834775932682/
 * Facebook Page: Vangav
 *   fb.com/vangav.f
 * 
 * Third party communities for Vangav Backend
 *   - play framework
 *   - cassandra
 *   - datastax
 *   
 * Tag your question online (e.g.: stack overflow, etc ...) with
 *   #vangav_backend
 *   to easier find questions/answers online
 * */

package com.vangav.vos_instagram_dash_board.controllers.get_daily_users_error_logs.response_json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author mustapha
 * fb.com/mustapha.abdallah
 */
/**
 * ResponseUserErrorLog represents single user's error log
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseUserErrorLog {

  @JsonProperty
  public String log_id;
  @JsonProperty
  public String log_time;
  @JsonProperty
  public String controller_name;
  @JsonProperty
  public int http_status_code;
  @JsonProperty
  public String request;
  @JsonProperty
  public String error_response;
  
  /**
   * Constructor - ResponseErrorLog
   * @param logId
   * @param logTime
   * @param controllerName
   * @param httpStatusCode
   * @param request
   * @param errorResponse
   * @return new ResponseErrorLog Object
   * @throws Exception
   */
  @JsonIgnore
  public ResponseUserErrorLog (
    String logId,
    String logTime,
    String controllerName,
    int httpStatusCode,
    String request,
    String errorResponse) throws Exception {
    
    this.log_id = logId;
    this.log_time = logTime;
    this.controller_name = controllerName;
    this.http_status_code = httpStatusCode;
    this.request = request;
    this.error_response = errorResponse;
  }
}