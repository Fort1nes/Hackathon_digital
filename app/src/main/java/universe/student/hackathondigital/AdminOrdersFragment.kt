package universe.student.hackathondigital

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import universe.student.hackathondigital.databinding.FragmentAdminOrdersBinding


class AdminOrdersFragment : Fragment(R.layout.fragment_admin_orders) {

    private lateinit var binding: FragmentAdminOrdersBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var adminOrdersList: ArrayList<AdminOrders>
    private lateinit var adminOrdersAdapter: AdminOrdersAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentAdminOrdersBinding.bind(view)

        binding.btnExperts.setOnClickListener {
            findNavController().navigate(R.id.action_adminOrdersFragment_to_adminExpertsFragment)
        }

        recyclerView = binding.recyclerAdminOrders
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = LinearLayoutManager(activity)
        adminOrdersList = ArrayList()

        adminOrdersList.add(AdminOrders("Организация Хакатона"))

        adminOrdersAdapter = AdminOrdersAdapter(adminOrdersList)
        recyclerView.adapter = adminOrdersAdapter
    }
}