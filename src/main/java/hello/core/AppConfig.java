package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {
    private static MemoryMemberRepository memberRepository() {  //중복 제거
        return new MemoryMemberRepository();
    }

    private static RateDiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
    
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy()); //구현 객체 생성
    }
}
