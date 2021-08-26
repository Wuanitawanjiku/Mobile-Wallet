package com.example.walletapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionsAdapter(var transactionList: List<Attributes>): RecyclerView.Adapter<TransactionsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.transactions_list, parent, false)
        return TransactionsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionsViewHolder, position: Int) {
        var currentTransactions = transactionList.get(position)

    }

    override fun getItemCount(): Int {
      return transactionList.size
    }
}

class TransactionsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvAccountName = itemView.findViewById<TextView>(R.id.tvName)
    var tvCurrency = itemView.findViewById<TextView>(R.id.tvCurrency)
    var tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    var tvAverage = itemView.findViewById<TextView>(R.id.tvAverage)
}