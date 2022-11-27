package universe.student.hackathondigital

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import universe.student.hackathondigital.databinding.FragmentProviderMainBinding

class ProviderMainFragment : Fragment(R.layout.fragment_provider_main) {

    private lateinit var binding: FragmentProviderMainBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var ordersList: ArrayList<Orders>
    private lateinit var ordersAdapter: OrdersAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProviderMainBinding.bind(view)

        recyclerView = binding.recyclerOrders
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = LinearLayoutManager(activity)
        ordersList = ArrayList()

        ordersList.add(Orders("Мобильное приложение", "Создать мобильное приложения для онлайн магазина"))
        ordersList.add(Orders("Организация Хакатона", "Организовать двухдневный Хакатон в СурГУ"))
        ordersList.add(Orders("Ораганизация корпоратива", "Организовать корпоратив для Газпром"))
        ordersList.add(Orders("Создание сайта", "Создать сайт для пекарни"))

        ordersAdapter = OrdersAdapter(ordersList)
        recyclerView.adapter = ordersAdapter

        ordersAdapter.onItemClick = {
            val intent = Intent(activity, OrderActivity::class.java)
            startActivity(intent)
        }
    }
}