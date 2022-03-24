package org.nsh.tugas3_elvinaafriani;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hospital extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listHospital = new String[]{"RS Awal Bros", "RS Eria Bunda", "RS Syafira", "RS Prima"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listHospital));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        showPilihan(pilihan);
    }

    private void showPilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("RS Awal Bros")) {
                a = new Intent(this, AwalBross.class);
            } else if (pilihan.equals("RS Eria Bunda")) {

            } else if (pilihan.equals("RS Syafira")) {

            } else if (pilihan.equals("RS Prima")) {

            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
