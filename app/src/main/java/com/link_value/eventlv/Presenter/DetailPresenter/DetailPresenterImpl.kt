package com.link_value.eventlv.Presenter.DetailPresenter

import com.link_value.eventlv.View.Detail.SubscriptionView
import java.util.*

/**
 * Created by julienb on 29/01/18.
 */
class DetailPresenterImpl(private val subscriptionView: SubscriptionView) : DetailPresenter {
    override fun start() {

    }

    override fun isLoggedInUserParticipating(subscriptionView: SubscriptionView) {
        subscriptionView.onSubscribed()
    }

    override fun subscribeToEvent() {

    }

    override fun unsubscribeToEvent() {
    }
}