package id.ac.ui.cs.mobileprogramming.ardian.elink.utils;

import androidx.room.TypeConverter;
import androidx.room.util.StringUtil;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static android.text.TextUtils.isEmpty;

public class MyTypeConverter {

    @TypeConverter
    public static List<Integer> stringToListInteger(String json){
        Gson gson = new Gson();
        Type type = new TypeToken<List<Integer>>() {}.getType();
        List<Integer> measurements = gson.fromJson(json, type);
        return measurements;
    }

    @TypeConverter
    public static String listIntToString(List<Integer> list){
        Gson gson = new Gson();
        Type type = new TypeToken<List<Integer>>() {}.getType();
        String json = gson.toJson(list, type);
        return json;
    }

//    @TypeConverter
//    public static Date fromTimestamp(Long value) {
//        return value == null ? null : new Date(value);
//    }
//
//    @TypeConverter
//    public static Long dateToTimestamp(Date date) {
//        return date == null ? null : date.getTime();
//    }

//    @TypeConverter
//    public static Date toDate(Long dateLong){
//        return dateLong == null ? null: new Date(dateLong);
//    }
//
//    @TypeConverter
//    public static Long fromDate(Date date){
//        return date == null ? null : date.getTime();
//    }
}


