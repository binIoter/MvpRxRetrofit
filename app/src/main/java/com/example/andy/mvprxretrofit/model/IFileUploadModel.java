package com.example.andy.mvprxretrofit.model;

import java.util.Map;

import okhttp3.RequestBody;

/**
 * <pre>
 *
 *      文件上传interface
 *
 *
 *      <pre/>
 *
 * 文件名： MvpRxRetrofit
 * Created by WestDeco on 2017/3/31.
 * 签名： 用风雅的态度看世界，用痞子的风格过日子
 * E-mail：  717616019@qq.com
 * GitHub：  https://github.com/KellenHu
 * CSDN：    http://my.csdn.net/westdeco
 */

public interface IFileUploadModel<T> {
    void onFileUpload(OnNetResponseListener<T> onNetResponseListener, String description,Map<String, RequestBody> fileMap);
}
