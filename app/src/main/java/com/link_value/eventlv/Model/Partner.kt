package com.link_value.eventlv.Model

import android.graphics.Bitmap
import android.os.Parcel
import android.os.Parcelable

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by julienb on 29/11/17.
 */

class Partner : Parcelable {

    @SerializedName("username")
    @Expose
    var username: String

    @SerializedName("avatarUrl")
    @Expose
    var avatarUrl: String

    var avatar: Bitmap?

    constructor(username: String, avatarUrl: String) {
        this.username = username
        this.avatarUrl = avatarUrl
        avatar = null
    }

    private constructor(`in`: Parcel) {
        username = `in`.readString()
        avatar = `in`.readParcelable(Bitmap::class.java.classLoader)
        avatarUrl = `in`.readString()
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(username)
        dest.writeParcelable(avatar, flags)
        dest.writeString(avatarUrl)
    }

    fun loadAvatar(bitmap: Bitmap) {
        avatar = bitmap
    }

    companion object {

        @JvmField val CREATOR: Parcelable.Creator<Partner> = object : Parcelable.Creator<Partner> {
            override fun createFromParcel(`in`: Parcel) = Partner(`in`)
            override fun newArray(size: Int) = arrayOfNulls<Partner>(size)
        }

        fun mockCurrentUser(): Partner{
            return Partner("joker", "http://www.free-emoticons.com/files/avatar-emoticons/2397.png")
        }
    }
}
