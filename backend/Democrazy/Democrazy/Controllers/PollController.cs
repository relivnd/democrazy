using Microsoft.AspNetCore.Mvc;
using WebApplication.Data;
using WebApplication.Models;

namespace WebApplication.Controllers
{
    [Route("api/polls")]
    [ApiController]
    public class PollController : Controller
    {
        private readonly PollRepo _pollRepo = new PollRepo();

        [HttpGet("{id}")]
        public ActionResult<Poll> GetPollById(int id)
        {
            var pollItem = _pollRepo.GetPollById(id);
            return Ok(pollItem);
        }
    }
}