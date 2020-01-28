package com.uottawa.PatientMonitorConfig;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;

@Component
public class PatientMonitorConfig {

	public void listen() {
		System.out.println("postconstruct");
		PubNub pubnub = PatientConfig.getPubNubConifg();
		pubnub.subscribe().channels(Arrays.asList("cloud")).execute();
		pubnub.addListener(new SubscribeCallback() {

			@Override
			public void status(PubNub pubnub, PNStatus status) {
				// TODO Auto-generated method stub

			}

			@Override
			public void presence(PubNub pubnub, PNPresenceEventResult presence) {
				// TODO Auto-generated method stub

			}

			@Override
			public void message(PubNub pubnub, PNMessageResult message) {

			}
		});

	}
}
