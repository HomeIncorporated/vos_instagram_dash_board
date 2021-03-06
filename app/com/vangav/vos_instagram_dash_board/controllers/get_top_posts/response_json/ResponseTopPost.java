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

package com.vangav.vos_instagram_dash_board.controllers.get_top_posts.response_json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author mustapha
 * fb.com/mustapha.abdallah
 */
/**
 * ResponseTopPost represents a response's top post
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseTopPost {

  @JsonProperty
  public double post_rank;
  @JsonProperty
  public String user_email;
  @JsonProperty
  public String user_name;
  @JsonProperty
  public String user_registration_date;
  @JsonProperty
  public long user_follow_count_last_week;
  @JsonProperty
  public long user_unfollow_count_last_week;
  @JsonProperty
  public long user_posts_count_last_week;
  @JsonProperty
  public long user_likes_count_last_week;
  @JsonProperty
  public long user_comments_count_last_week;
  @JsonProperty
  public String post_date;
  @JsonProperty
  public String post_time;
  @JsonProperty
  public String post_city;
  @JsonProperty
  public String post_country;
  @JsonProperty
  public String post_caption;
  @JsonProperty
  public long post_likes_count;
  @JsonProperty
  public long post_comments_count;
  
  /**
   * Constructor - ResponseTopPost
   * @param postRank
   * @param userEmail
   * @param userName
   * @param userRegistrationDate
   * @param userFollowCountLastWeek
   * @param userUnfollowCountLastWeek
   * @param userPostsCountLastWeek
   * @param userLikesCountLastWeek
   * @param userCommentsCountLastWeek
   * @param postDate
   * @param postTime
   * @param postCity
   * @param postCountry
   * @param postCaption
   * @param postLikesCount
   * @param postCommentsCount
   * @return new ResponseTopPost Object
   * @throws Exception
   */
  @JsonIgnore
  public ResponseTopPost (
    double postRank,
    String userEmail,
    String userName,
    String userRegistrationDate,
    long userFollowCountLastWeek,
    long userUnfollowCountLastWeek,
    long userPostsCountLastWeek,
    long userLikesCountLastWeek,
    long userCommentsCountLastWeek,
    String postDate,
    String postTime,
    String postCity,
    String postCountry,
    String postCaption,
    long postLikesCount,
    long postCommentsCount) throws Exception {
    
    this.post_rank = postRank;
    this.user_email = userEmail;
    this.user_name = userName;
    this.user_registration_date = userRegistrationDate;
    this.user_follow_count_last_week = userFollowCountLastWeek;
    this.user_unfollow_count_last_week = userUnfollowCountLastWeek;
    this.user_posts_count_last_week = userPostsCountLastWeek;
    this.user_likes_count_last_week = userLikesCountLastWeek;
    this.user_comments_count_last_week = userCommentsCountLastWeek;
    this.post_date = postDate;
    this.post_time = postTime;
    this.post_city = postCity;
    this.post_country = postCountry;
    this.post_caption = postCaption;
    this.post_likes_count = postLikesCount;
    this.post_comments_count = postCommentsCount;
  }
}
