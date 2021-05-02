package com.example.test.db.entities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "userdetails")
data class Userdetails(

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "User_Id")
    @SerializedName(value = "User_Id")
    @Expose
    val userId: String,

    @ColumnInfo(name = "Agency_Id")
    @SerializedName(value = "Agency_Id")
    @Expose
    val agencyId: String?,

    @ColumnInfo(name = "Apprvr_Type_Id")
    @SerializedName(value = "Apprvr_Type_Id")
    @Expose
    val apprvrTypeId: String?,

    @ColumnInfo(name = "Aprvd_Date")
    @SerializedName(value = "Aprvd_Date")
    @Expose
    val aprvdDate: String?,

    @ColumnInfo(name = "Branch_Id")
    @SerializedName(value = "Branch_Id")
    @Expose
    val branchId: String?,

    @ColumnInfo(name = "Chnl_Id")
    @SerializedName(value = "Chnl_Id")
    @Expose
    val chnlId: String?,

    @ColumnInfo(name = "City_Id")
    @SerializedName(value = "City_Id")
    @Expose
    val cityId: String?,

    @ColumnInfo(name = "Code")
    @SerializedName(value = "Code")
    @Expose
    val code: String?,

    @ColumnInfo(name = "Disprvd_Date")
    @SerializedName(value = "Disprvd_Date")
    @Expose
    val disprvdDate: String?,

    @ColumnInfo(name = "Dvc_Det_Text")
    @SerializedName(value = "Dvc_Det_Text")
    @Expose
    val dvcDetText: String?,

    @ColumnInfo(name = "Frbs_Id")
    @SerializedName(value = "Frbs_Id")
    @Expose
    val frbsId: String?,

    @ColumnInfo(name = "Lgcy_Srvr_Id")
    @SerializedName(value = "Lgcy_Srvr_Id")
    @Expose
    val lgcySrvrId: String?,

    @ColumnInfo(name = "Login_Id")
    @SerializedName(value = "Login_Id")
    @Expose
    val loginId: String?,

    @ColumnInfo(name = "Login_Valid_Flag")
    @SerializedName(value = "Login_Valid_Flag")
    @Expose
    val loginValidFlag: String?,

    @ColumnInfo(name = "Mob_User_Flag")
    @SerializedName(value = "Mob_User_Flag")
    @Expose
    val mobUserFlag: String?,

    @ColumnInfo(name = "Name")
    @SerializedName(value = "Name")
    @Expose
    val name: String?,

    @ColumnInfo(name = "Pwd_Rqstd_Flag")
    @SerializedName(value = "Pwd_Rqstd_Flag")
    @Expose
    val pwdRqstdFlag: String?,

    @ColumnInfo(name = "Req_Date")
    @SerializedName(value = "Req_Date")
    @Expose
    val reqDate: String?,

    @ColumnInfo(name = "Req_Id")
    @SerializedName(value = "Req_Id")
    @Expose
    val reqId: String?,

    @ColumnInfo(name = "Req_Num")
    @SerializedName(value = "Req_Num")
    @Expose
    val reqNum: String?,

    @ColumnInfo(name = "Type_Code")
    @SerializedName(value = "Type_Code")
    @Expose
    val typeCode: String?,

    @ColumnInfo(name = "Role_Id")
    @SerializedName(value = "Role_Id")
    @Expose
    val roleId: String?,

    @ColumnInfo(name = "User_Mob_Num")
    @SerializedName(value = "User_Mob_Num")
    @Expose
    val userMobNum: String?,

    @ColumnInfo(name = "User_Name")
    @SerializedName(value = "User_Name")
    @Expose
    val userName: String?,

    @ColumnInfo(name = "User_Stat_Id")
    @SerializedName(value = "User_Stat_Id")
    @Expose
    val userStatId: String?,

    @ColumnInfo(name = "User_Type_Id")
    @SerializedName(value = "User_Type_Id")
    @Expose
    val userTypeId: String?
)