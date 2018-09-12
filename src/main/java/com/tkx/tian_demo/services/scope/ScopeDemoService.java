package com.tkx.tian_demo.services.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ScopeDemoService {

}
