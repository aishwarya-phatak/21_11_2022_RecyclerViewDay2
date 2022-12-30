package com.example.recyclerviewday2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {

    TextView txtProductTitle,txtProductPrice;
    ImageView imgProduct;
    Product product;
    ArrayList<Product> products;

    public ProductsAdapter(ArrayList<Product> products){
        this.products = products;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProduct = itemView.findViewById(R.id.imgProduct);
            imgProduct.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        Product product = products.get(getAdapterPosition());
                        Intent intent = new Intent(v.getContext(),ProductsDetailActivity.class);

                          /*  intent.putExtra("id",product.getId());
                            intent.putExtra("imageId",product.getImageId());
                            intent.putExtra("title",product.getTitle());
                            intent.putExtra("price",product.getPrice());

                           */
                            intent.putExtra("product",product);
                            v.getContext().startActivity(intent);
                        }
                    }
            );
        }
    }

    @NonNull
    @Override
    public ProductsAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.product_view,null);
        imgProduct = view.findViewById(R.id.imgProduct);
        /*imgProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Toast.makeText(view1.getContext(), "image Clicked", Toast.LENGTH_LONG).show();
            }
        });

        txtProductTitle = view.findViewById(R.id.txtProductTitle);
        txtProductTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "txtTitleClicked", Toast.LENGTH_LONG).show();
            }
        });

        txtProductPrice = view.findViewById(R.id.txtProductPrice);

        txtProductPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(view.getContext(), "txtPriceClicked", Toast.LENGTH_LONG).show();
            }
        });

*/
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsAdapter.ProductViewHolder holder, int position) {
        
        Product product = products.get(position);
/*
        holder.itemView.findViewById(R.id.imgProduct).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(),product.getImageId()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );

        holder.itemView.findViewById(R.id.txtProductTitle).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(),product.getTitle(),Toast.LENGTH_LONG).show();
                    }
                }
        );

        holder.itemView.findViewById(R.id.txtProductPrice).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),product.getPrice()+"",Toast.LENGTH_LONG).show();
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
