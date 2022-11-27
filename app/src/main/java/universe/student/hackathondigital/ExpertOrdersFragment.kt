package universe.student.hackathondigital

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import universe.student.hackathondigital.databinding.FragmentExpertOrdersBinding


class ExpertOrdersFragment : Fragment(R.layout.fragment_expert_orders) {

    private lateinit var binding: FragmentExpertOrdersBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var ordersList: ArrayList<Orders>
    private lateinit var ordersAdapter: OrdersAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentExpertOrdersBinding.bind(view)

        recyclerView = binding.recyclerOrders
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = LinearLayoutManager(activity)
        ordersList = ArrayList()

        ordersList.add(Orders("Мобильное приложение", "Создать мобильное приложения для онлайн магазина"))
        ordersList.add(Orders("Организация Хакатона", "Организовать двухдневный Хакатон в СурГУ"))

        ordersAdapter = OrdersAdapter(ordersList)
        recyclerView.adapter = ordersAdapter
    }
}