package com.webtoons.webtoons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.webtoons.webtoons.service.PostService;

import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/api")
public class PostController {

	//GET /webtoons
	
    @Autowired
    private PostService postService;
    @GetMapping("/webtoons")
    List<Map<String,Object>> getAllPosts(){
      return   postService.getPosts();
    }

    @GetMapping("/webtoonsById/{id}")
    Map<String,Object>getPostByid(@PathVariable int id ){
        return   postService.getPostById(id);
    }

    @PostMapping("/webtoons")
    Map<String,Object>insertPost(@RequestBody Map<String,Object> payload ){
        return   postService.insertPosts(payload);
    }

    @PutMapping("//webtoons/{id}")
    Map<String,Object>updatePost(@RequestBody Map<String,Object> payload , @PathVariable int id  ){
        return   postService.updatePosts(payload, id );
    }

    @DeleteMapping("/deletewebtoons/{id}")
    Map<String,Object>deletePosts( @PathVariable int id  ){
        return   postService.deletePost( id );
    }
}
