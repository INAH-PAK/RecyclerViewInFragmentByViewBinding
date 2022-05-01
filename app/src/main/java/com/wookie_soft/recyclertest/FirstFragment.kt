package com.wookie_soft.recyclertest

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wookie_soft.recyclertest.databinding.FragmentFirstBinding


class FirstFragment: Fragment() {
    lateinit var fragmentBinding: FragmentFirstBinding
    lateinit var recyclerView:RecyclerView
    lateinit var mAdapter: RecyclerViewAdapter
    var items = mutableListOf<Item>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentBinding= FragmentFirstBinding.inflate( inflater, container, false)

        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        items.add(Item("aaa","sss","ddd","aaa"))
        items.add(Item("bbb","cc","g","aaa"))
        items.add(Item("ccc","sscs","ddd","aaa"))
        items.add(Item("vv","sscs","ddd","aaa"))
        items.add(Item("aaxxa","sdssess","ddd","aaa"))

        if(fragmentBinding.recyclerView != null) Toast.makeText(requireContext(), " 리사이클러뷰 는 존재", Toast.LENGTH_SHORT).show()


        recyclerView= fragmentBinding.recyclerView
        fragmentBinding.recyclerView.adapter = childFragmentManager?.let{ RecyclerViewAdapter(activity as Context, items, it)}


    }

    // 화면 갱신시 리사이클러뷰 초기화
    override fun onResume() {
        super.onResume()
        fragmentBinding.recyclerView.adapter?.notifyDataSetChanged()

    }





}
