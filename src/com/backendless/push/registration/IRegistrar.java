/*
 * ********************************************************************************************************************
 *  <p/>
 *  BACKENDLESS.COM CONFIDENTIAL
 *  <p/>
 *  ********************************************************************************************************************
 *  <p/>
 *  Copyright 2012 BACKENDLESS.COM. All Rights Reserved.
 *  <p/>
 *  NOTICE: All information contained herein is, and remains the property of Backendless.com and its suppliers,
 *  if any. The intellectual and technical concepts contained herein are proprietary to Backendless.com and its
 *  suppliers and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret
 *  or copyright law. Dissemination of this information or reproduction of this material is strictly forbidden
 *  unless prior written permission is obtained from Backendless.com.
 *  <p/>
 *  ********************************************************************************************************************
 */

package com.backendless.push.registration;

import android.content.Context;
import android.content.Intent;

import java.util.Date;

interface IRegistrar
{
  void register( Context context, String senderId, Date expiration, IDeviceRegistrationCallback callback );

  //void retry( Context context, Intent intent );

  void unregister( Context context, IDeviceRegistrationCallback callback );

  void registrationCompleted( String senderId, String deviceToken, Long registrationExpiration, String callbackId );

  void registrationFailed( String error, String callbackId );

  void unregistrationCompleted( String callbackId );

  void unregistrationFailed( String error, String callbackId );

  boolean isRegistered( Context context );
}
