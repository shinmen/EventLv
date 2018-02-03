package com.link_value.eventlv.View.Detail


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.link_value.eventlv.Model.EventLV

import com.link_value.eventlv.R


/**
 * A simple [Fragment] subclass.
 */
class MapFragment : Fragment() {

    private lateinit var mEventDetail: EventLV

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mEventDetail = arguments!!.getParcelable(MapFragment.EVENT_LV) as EventLV
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    companion object {
        private const val EVENT_LV = "map_event_fragment"

        fun newInstance(eventLv: EventLV): MapFragment {
            val fragment = MapFragment()
            val args = Bundle()
            args.putParcelable(EVENT_LV, eventLv)
            fragment.arguments = args

            return fragment
        }

    }

}
