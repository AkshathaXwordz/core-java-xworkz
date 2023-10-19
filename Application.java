package com.xworkz.playstore.application;
import lombok.*;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    private  int appId;
    private String appName;
    private  String appVersion;
    private String releaseDate;
    private String companyName;
    private String appType;


}
