package com.development.id.ns.leddit

import org.mockito.Mockito

/**
 * Created by Drago on 7/30/2017.
 */

inline fun <reified T : Any> mock(): T = Mockito.mock(T::class.java)