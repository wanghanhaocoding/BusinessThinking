package com.only4play.system.infrastructure.security.authentication.admin.password;

import cn.hutool.jwt.JWTUtil;
import com.google.common.collect.Maps;
import com.only4play.security.base.BaseAuthenticationProvider;
import com.only4play.security.base.LoginSuccessToken;
import com.only4play.security.config.AuthErrorMsg;
import com.only4play.system.domain.admin.AdminUser;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;


@Component
@Slf4j
@RequiredArgsConstructor
public class AdminPasswordAuthenticationProvider extends BaseAuthenticationProvider implements
    AuthenticationProvider {


  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    return null;
  }

  @Override
  public boolean supports(Class<?> authentication) {
    return false;
  }
}
